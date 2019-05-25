package BajdaPawel;

import java.util.regex.Pattern;

public class PostalCodesValidator {

    final static Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");


    public static boolean validate(String postalCode)  {

        if(postalCode == null){
            return false;

        }
        return pattern.matcher(postalCode).matches();

    }
}
