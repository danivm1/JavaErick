package t03;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;

public class exe2 {
    public static void main(String... args) throws IOException, InterruptedException, InputMismatchException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);
        String a;
        double sum = 0;
        int i = 0;
        boolean x = true;

        System.out.println("Insira os números para calcular a média, insira 'S' para parar:");

        do {
            try {
                while (true){
                    a = sc.nextLine();
                    if((a.equals("s") || a.equals("S")) && i>0){x = false;break;}
                    else if((a.equals("s") || a.equals("S")) && i==0){
                        System.out.println("Nenhum número inserido, realmente deseja finalizar? s/n");
                        a = sc.nextLine();
                        if(a.equals("s") || a.equals("S")){sc.close();return;}
                        else{System.out.println("Insira os números:");}
                    }else{
                        sum += Double.parseDouble(a);
                        i++;
                    }
                }

                

                double med = sum/i;
                String sMed = String.format("A média é %.2f", med);
                System.out.println(sMed);

            } catch (NumberFormatException e) {
                System.out.println("Um caractere não numérico foi inserido, tente novemante com um número.");
            }
        } while (x);

        sc.close();
    }
}