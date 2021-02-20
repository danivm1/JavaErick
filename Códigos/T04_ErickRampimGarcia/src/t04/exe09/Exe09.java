package t04.exe09;

import java.util.Scanner;
import java.io.IOException;

public class Exe09{
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new  Scanner(System.in);

        String x;
        double r;

        do{
            System.out.print("Insira o raio do círculo: ");
            x = sc.nextLine();
            try{
                r = Double.parseDouble(x);
                break;
            }catch(NumberFormatException e){
                System.out.println("Insira um valor numérico apenas.");
            }
        }while(true);

        UsaCircunferencia a = new UsaCircunferencia(r);

        System.out.println(a);

        sc.close();
    }
}