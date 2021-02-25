package t01;

import java.util.Scanner;

public class Nome {
    public static void main(String args[]){
    
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