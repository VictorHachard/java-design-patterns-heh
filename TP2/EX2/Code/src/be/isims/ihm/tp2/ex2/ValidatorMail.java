package be.isims.ihm.tp2.ex2;

import java.util.regex.Pattern;

public class ValidatorMail implements Strategy {

    private Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");

    @Override
    public boolean validator(String str) {
        if (str == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

}
