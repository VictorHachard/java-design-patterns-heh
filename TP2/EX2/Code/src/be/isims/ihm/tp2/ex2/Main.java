package be.isims.ihm.tp2.ex2;

public class Main {

    public static void main(String[] args) {
        String str = "6";
        System.out.println("La chaine de caractère : " + str);
        Validator validator = new Validator(str, new ValidatorNumber());
        System.out.println("Est-ce que " + str + " est un entier valide ? " + validator.isValide());
        validator = new Validator(str, new ValidatorMail());
        System.out.println("Est-ce que "+ str + " est un mail valide ? " + validator.isValide());
        System.out.println("----------------------");
        str = "toto@gmail.com";
        System.out.println("La chaine de caractère : " + str);
        Validator validator2 = new Validator(str, new ValidatorNumber());
        System.out.println("Est-ce que "+ str + " est un entier valide ? " + validator2.isValide());
        validator2 = new Validator(str, new ValidatorMail());
        System.out.println("Est-ce que " + str + " est un mail valide ? " + validator2.isValide());
    }
}
