package t02;

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a distância em kilômetros: ");
        double s = sc.nextDouble();

        System.out.print("Informe o tempo em horas: ");
        double t = sc.nextDouble();

        double v = s/t;
        
        String vm = String.format("A velocidade média é %.2f km/h\n", v);
        System.out.println(vm);
        
        sc.close();
    }
}