package t03;

import java.util.Scanner;
import java.io.IOException;
import java.lang.NumberFormatException;

public class exe6 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        Double indicePluv[] = new Double[7];
        String a;

        for(int i=0; i<7; i++){
            a = sc.nextLine();
            try{
                indicePluv[i] = Double.parseDouble(a);
            }catch(NumberFormatException e){
                System.out.println("Valor inválido, insira apenas números reais");
                i--;
            }
        }

        double soma = 0;

        for(int i=0; i<7; i++){
            soma += indicePluv[i];
        }

        double media = soma / 7;

        double aux = indicePluv[0];
        int min = 0;

        for(int i=1; i<7; i++){
            if(aux>indicePluv[i]){
                aux = indicePluv[i];
                min = i;
            }
        }

        int max = 0;

        for(int i=1; i<7; i++){
            if(aux<indicePluv[i]){
                aux = indicePluv[i];
                max = i;
            }
        }

        String s = String.format("Média: %.2f\nMaior: %.2f\nMenor: %.2f", media, indicePluv[max], indicePluv[min]);
        System.out.println(s);

        sc.close();
    }
}
