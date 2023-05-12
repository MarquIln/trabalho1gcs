package hello;
import java.util.Scanner;

public class Beecrowd_1143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 1 && n < 1000) {
            for (int i = 1; i <= n; i++) {
                int square = i * i;
                int cube = i * i * i;
                System.out.print(i + " " + square + " " + cube);
                System.out.println();
            }
        } else {
            System.out.println("Escolha um numero entre 1 e 1000");
        }
    }
}
