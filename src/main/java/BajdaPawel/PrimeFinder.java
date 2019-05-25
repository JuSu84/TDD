package BajdaPawel;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    int amount = 5;

    public static ArrayList findPrimes(Integer amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Ilosc liczb musi byc dodatnia");
        }
        int finds = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 2;
        while (amount > finds) {
            if (isPrime(i)) {
                list.add(i);
                finds++;
            }
            i++;
        }
        return list;
    }
}



