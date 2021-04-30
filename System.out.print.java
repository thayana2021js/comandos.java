import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int cont =0;
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                cont++;
            System.out.println(i);
            }
        }
        System.out.println("Quantidade de numeros pares  é: "+cont);
    }
}


