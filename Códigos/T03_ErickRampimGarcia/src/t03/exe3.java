package t03;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.lang.NumberFormatException;

public class exe3 {
    public static void main(String... args) throws IOException, InterruptedException, InputMismatchException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        int vetor[] = new int[20];
        Scanner sc = new Scanner(System.in);
        String a;

        for(int i=0; i<20; i++){
            a = sc.nextLine();
            try{
                vetor[i] = Integer.parseInt(a);
            }catch (NumberFormatException e){
                System.out.print("Caractere inválido, tente novamente com um número inteiro.");
                i--;
            }
        }

        int soma = 0;

        for(int i=0; i<20; i++){
            if(vetor[i]%2==0){
                soma += vetor[i];
            }
        }

        System.out.println("\nA soma dos números pares é " + soma);

        sc.close();
    }
}
