package t01;

import java.util.Scanner;
import java.io.IOException;

public class exe8 {
    public static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();   //Limpar tela
    
        System.out.print("Nome completo: ");

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        String[] x = nome.split(" ");

        for(int i = x.length - 1; i >= 0; i--){
            System.out.println(x[i]);
        }

        sc.close();
    }
}
