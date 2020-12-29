package src.t01;

import java.io.IOException;
import java.util.Scanner;

public class exe9 {
    public static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();   //Limpar tela

        System.out.print("Java Calculadora ");
        
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        String[] y = x.split(" ");

        float n1 = Float.parseFloat(y[0]);
        float n2 = Float.parseFloat(y[1]);

        switch (y[2]) {
            case "+":
                System.out.println(n1+n2);
                break;
            
            case "-":
                System.out.println(n1-n2);
                break;
            
            case "*":
                System.out.println(n1*n2);
                break;
            
            case "/":
                System.out.println(n1/n2);
                break;
                
            default:
                break;
        }

        sc.close();
    }
}
