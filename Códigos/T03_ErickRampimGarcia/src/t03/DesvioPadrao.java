package t03;

import java.util.Scanner;


public class DesvioPadrao {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String a;
        int n=0;
        boolean b;

        System.out.print("Insira o número de amostras: ");

        do{
            a = sc.nextLine();
            b = false;
            try{
                n = Integer.parseInt(a);
                if(n<=1){
                    System.out.println("Número de amostras inválido, valor precisa ser inteiro maior que 1.");
                    b = true;
                }
            }catch(NumberFormatException e){
                System.out.println("Insira um número inteiro.");
                b = true;
            }
            
        }while(b);

        double[] amostras = new double[n];

        System.out.println("\nInsira os valores das amostras:");

        for(int i=0; i<n; i++){
            a = sc.nextLine();
            try{
                amostras[i] = Double.parseDouble(a);
            }catch(NumberFormatException e){
                System.out.println("Insira um número.");
                i--;
            }
        }

        double sum=0;

        for(int i=0; i<n; i++){
            sum += amostras[i];
        }

        double medAmostral = sum/n;

        sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.pow((amostras[i]-medAmostral), 2);
        }

        double s = Math.sqrt(sum/(n-1));

        String str = String.format("O desvio padrão amostral é %.2f.", s);
        System.out.println(str);

        sc.close();
    }
}