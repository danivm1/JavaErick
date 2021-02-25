package t03;

import java.util.Scanner;

public class Palindromo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase");

        String frase = sc.nextLine();

        frase = frase.replaceAll("[\\s-,;\\.!]", "").toLowerCase();

        String rFrase = frase;
        rFrase = new StringBuilder(rFrase).reverse().toString();

        System.out.println(frase);
        System.out.println(rFrase);

        if(frase.equals(rFrase)){
            System.out.println("Esta frase é um palíndromo.");
        }else{
            System.out.println("Esta frase não é um palíndromo.");
        }

        sc.close();
    }
}