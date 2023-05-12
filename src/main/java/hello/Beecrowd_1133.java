package hello;

public class Beecrowd_1133 {
    public static int solucao(int a, int b){
        int [] solucao = {-1};
        if (a > b) {
            int[] aux = new int[a-b];
            int count = 0;
            for (int i = b+1;i<a;i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    aux[count] = i;
                    count++;
                }
            }
            solucao = aux;
        }else if(b > a){
            int[] aux = new int[b-a];
            int count = 0;
            for (int i = a+1;i<b;i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    aux[count] = i;
                    count++;
                }
            }
            solucao = aux;
        }
        return solucao[0];
    }
}
