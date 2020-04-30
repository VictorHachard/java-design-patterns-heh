package be.isims.ihm.tp6.ex2;

import java.io.*;

public class Copy {

    /**
     * http://www.java2s.com/Tutorial/Java/0180__File/Usebufferedstreamstocopyafile.htm
     */
    public static void andReplaceWhiteSpace(String source, String dest, char newChar) throws IOException {
        BufferedInputStream bSource = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bDest = new BufferedOutputStream(new FileOutputStream(dest));
        int i;
        do {
            i = bSource.read();
            if (i != -1)
                if (Character.isWhitespace(i))
                    bDest.write(newChar);
                else
                    bDest.write(i);
        } while (i != -1);
        bSource.close();
        bDest.close();
    }

}
