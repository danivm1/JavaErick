package t02;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class exe13 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpar tela

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número natural: ");
        int n = sc.nextInt();

        if (n < 0 || n%1 != 0){
            System.out.println("O número inserido não pertence ao conjuntos dos números naturais (inteiros positivos).");
            sc.close();
            return;
        }

        List<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size()-1) < n){
            fibonacci.add(fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2));
        }

        System.out.println(fibonacci);

        sc.close();
    }
}
