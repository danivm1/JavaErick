package t04.exe09;

import java.util.Scanner;

public class CalcArea{
    public static void main(String args[]){

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