package t01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]){

        System.out.print("Java Calculadora ");
        
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        String[] y = x.split(" ");

        float n1 = Float.parseFloat(y[0]);
        float n2 = Float.parseFloat(y[1]);

        switch (y[2]) {
            case "+":
                System.out.println(n1+n2);
                break;
            
            case "-":
                System.out.println(n1-n2);
                break;
            
            case "x":
                System.out.println(n1*n2);
                break;
            
            case "/":
                System.out.println(n1/n2);
                break;
                
            default:
                break;
        }

        sc.close();
    }
}
