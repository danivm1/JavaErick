package t02;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;



public class exe8 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpar tela

        Scanner sc = new Scanner(System.in);

        double[] a = new double[2];
        double[] b = new double[2];

        System.out.print("Insira as coordenadas do ponto A (Ax,Ay): ");
        String coordA = sc.nextLine();
        String[] arrayCoordA = coordA.split(",");
        
        for (int i=0; i<2; i++){
            a[i] = Double.parseDouble(arrayCoordA[i]);
        }

        System.out.print("Insira as coordenadas do ponto B (Bx,By): ");
        String coordB = sc.nextLine();
        String[] arrayCoordB = coordB.split(",");

        for (int i=0; i<2; i++){
            b[i] = Double.parseDouble(arrayCoordB[i]);
        }

        double x = b[0] - a[0]; 
        double y = b[1] - a[1];

        double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        String sDist = String.format("Módulo do vetor resultante: %.2f", dist);
        sDist = sDist.replace(",",".");
        System.out.println(sDist);

        sc.close();
    }
}
