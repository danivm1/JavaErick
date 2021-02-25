package t05.exe03;

import java.util.Scanner;

public class UtilizaPonto3D {
    public static void UsaPonto3D(Ponto3D p){
        Scanner sc = new Scanner(System.in);

        double[] coord = new double[3];
        String x, y, z;
        
        System.out.println("\nInsira as coordenadas (x, y, z) do objeto");

        do{
            System.out.print("x: ");
            x = sc.nextLine();
            System.out.print("y: ");
            y = sc.nextLine();
            System.out.print("z: ");
            z = sc.nextLine();
            try{
                coord[0] = Double.parseDouble(x);
                coord[1] = Double.parseDouble(y);
                coord[2] = Double.parseDouble(z);
                break;
            }catch(NumberFormatException e){
                System.out.println("Insira apenas números.");
            }
        }while(true);

        Ponto3D obj = new Ponto3D(coord[0], coord[1], coord[2]);

        double dist = p.calculaDistancia(p, obj);

        System.out.println(String.format("A distância entre o ponto 'p' e o objeto é de %.2f.", dist));

        sc.close();
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double[] coord = new double[3];
        String x, y, z;
        
        System.out.println("Insira as coordenadas (x, y, z) do ponto");

        do{
            System.out.print("x: ");
            x = sc.nextLine();
            System.out.print("y: ");
            y = sc.nextLine();
            System.out.print("z: ");
            z = sc.nextLine();
            try{
                coord[0] = Double.parseDouble(x);
                coord[1] = Double.parseDouble(y);
                coord[2] = Double.parseDouble(z);
                break;
            }catch(NumberFormatException e){
                System.out.println("Insira apenas números.");
            }
        }while(true);

        System.out.print("Cor do ponto: ");
        String cor = sc.nextLine();

        double intensidade;
        
        do{
            System.out.print("Intensidade da cor: ");
            x = sc.nextLine();
            try{
                intensidade = Double.parseDouble(x);
                break;
            }catch(NumberFormatException e){
                System.out.println("Insira apenas números.");
            }
        }while(true);

        Ponto3D p = new Ponto3D(coord[0], coord[1], coord[2], cor, intensidade);

        UsaPonto3D(p);

        sc.close();
    }
}
