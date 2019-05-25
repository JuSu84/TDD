package BajdaPawel;

public class Prime {


    public static boolean isPrime(Integer liczba) {

        if((liczba == null) || (liczba < 2)){
            return false;
        }
        for (int i = 2; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}
