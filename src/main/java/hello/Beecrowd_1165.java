package hello;

public class Beecrowd_1165 {
    public static boolean ehPrimo(int x) {
        boolean ehPrimo = false;
        for (int i = 0; i < 100; i++) {
            ehPrimo = true;
            if (x == 1 || (x % 2 == 0 && x != 2)) {
                ehPrimo = false;
            } else {
                for (int j = 3; j <= Math.sqrt(x); j += 2) {
                    if (x % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }
        }
        return ehPrimo;
    }

}
