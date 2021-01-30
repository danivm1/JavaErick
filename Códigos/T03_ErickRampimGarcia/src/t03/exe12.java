package t03;

import java.util.Scanner;
import java.io.IOException;

public class exe12 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a ordem da matriz");

        String a;
        int m=0;
        boolean x;

        do{
            a = sc.nextLine();
            x = false;
            try{
                m = Integer.parseInt(a);
                if(m<=0){
                    System.out.println("Insira um número inteiro maior que 0.");
                    x = true;
                }
            }catch(NumberFormatException e){
                System.out.println("Insira um número inteiro maior que zero.");
                x = true;
            }
            
        }while(x);

        sc.close();
    }
}
