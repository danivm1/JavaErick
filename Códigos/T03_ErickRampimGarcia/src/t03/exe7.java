package t03;

import java.util.Scanner;
import java.io.IOException;
import java.lang.NumberFormatException;

public class Exe7 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários a empresa possui? ");
        int m;
        do{
            String n = sc.next();
            try{
                m = Integer.parseInt(n);
                if(m>0){break;}
                else{System.out.println("Insira um valor válido");}
            }catch(NumberFormatException e){
                System.out.println("Insira um valor válido");
            }
        }while(true);

        System.out.println("Informe o nome e o salário de cada funcionário.");

        String nome[] = new String[m];
        double salario[] = new double[m];

        boolean x;
        

        for(int i=0; i<m; i++){
            System.out.print("Funcionário "+i+"\nNome: ");
            do{
                nome[i] = sc.next();
                if(nome[i].length()<4){

                }else{break;}
            }while(true);
            do{
                x = false;
                System.out.print("Salário: ");
                String sal = sc.next();
                try{
                    salario[i] = Double.parseDouble(sal);
                }catch(NumberFormatException e){
                    System.out.println("Entrada inválida, digite novamente um valor real.");
                    x = true;
                }
                if(salario[i]<0){
                    System.out.println("Informe um salário válido.");
                    x = true;
                }
            }while(x);
        }

        double soma = 0;

        for(int i=0; i<m; i++){
            soma += salario[i];
        }

        double mediaSalEmp = soma / m;

        for(int i=0; i<m; i++){
            if(salario[i]>mediaSalEmp){
                String s = String.format("Funcionário: %s\nSalário: %.2f", nome[i], salario[i]);
                System.out.println(s);
            }
        }

        sc.close();
    }
}
