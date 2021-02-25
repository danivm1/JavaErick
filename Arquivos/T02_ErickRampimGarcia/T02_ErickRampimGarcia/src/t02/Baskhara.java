package t02;

import java.util.Scanner;
import java.lang.Math;

public class Baskhara {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira os 3 coeficientes separados por espaço: ");
        String coef = sc.nextLine();

        String[] arrayCoef = coef.split(" ");
        double a = Double.parseDouble(arrayCoef[0]);
        double b = Double.parseDouble(arrayCoef[1]);
        double c = Double.parseDouble(arrayCoef[2]);

        double delta = Math.pow(b,2)-(4*a*c);
        if (delta < 0){
            System.out.println("Impossível resolver a equação.");
        }else{
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b+raizDelta)/(2*a);
            double x2 = (-b-raizDelta)/(2*a);

            String raizes = String.format("As raízes são %.2f e %.2f", x1, x2);
            System.out.println(raizes);
        }
        sc.close();
    }
}
