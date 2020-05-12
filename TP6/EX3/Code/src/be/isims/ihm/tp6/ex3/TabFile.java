package be.isims.ihm.tp6.ex3;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class TabFile {

    private int size;
    private File file;

    public TabFile(int size, String filename) {
        this.size = size - 1;
        try {
            file = new File(filename);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int get(int i) throws IOException {
        if (i > size)
            throw new ArrayIndexOutOfBoundsException();

        FileChannel ch = new FileInputStream(file).getChannel();
        ch.position(i*4);
        ByteBuffer b = ByteBuffer.allocate(4);
        ch.read(b);
        ch.close();
        byte[] bytes = b.array();
        System.out.println(Arrays.toString(bytes));
        return (bytes[0] << 24) | (bytes[1] << 16) | (bytes[2] << 8 ) | bytes[3];
    }

    /**
     * https://www.programcreek.com/java-api-examples/?class=java.nio.channels.FileChannel&method=write
     */
    public void add(int i, int data) throws IOException {
        if (i > size)
            throw new ArrayIndexOutOfBoundsException();

        FileChannel ch = new RandomAccessFile(file, "rw").getChannel();
        ch.position(i*4);
        ch.force(true);
        ch.write(ByteBuffer.allocate(4).putInt(data).flip());
        ch.close();
    }

}
