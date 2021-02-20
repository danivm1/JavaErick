package t03;

import java.util.Scanner;
import java.io.IOException;

public class Exe12 {
    public static double[][] preencheMatriz(int m){
        Scanner sc = new Scanner(System.in);

        String a;
        double[][] mat = new double[m][m];
        int i, j;
        System.out.println("Preencha a matriz");
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.print(String.format("Casa (%d, %d): ", i, j));
                a = sc.nextLine();
                try{
                    mat[i][j] = Double.parseDouble(a);
                }catch(NumberFormatException e){
                    System.out.println("Insira um número.");
                    j--;
                }
            }
        }
        sc.close();
        return mat;
    }

    public static double[] somaDiag(double[][] mat, int m){
        double[] s = {0,0,0};
        int i, j;

        for(i=0;i<m;i++){
            j=i;
            s[0] += mat[i][j];
            j=m-i-1;
            s[1] += mat[i][j];
        }
        s[2] = s[0] + s[1];
        
        return s;
    }

    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a ordem da matriz");

        String a;
        int m=0;
        boolean x;

        do{
            a = sc.nextLine();
            x = false;
            try{
                m = Integer.parseInt(a);
                if(m<=0){
                    System.out.println("Ordem da matriz inválida, valor precisa ser maior que 0.");
                    x = true;
                }
            }catch(NumberFormatException e){
                System.out.println("Insira um número inteiro.");
                x = true;
            }
            
        }while(x);

        double[][] mat = preencheMatriz(m);

        double[] soma = somaDiag(mat, m);

        String s = String.format("Soma da diagonal principal: %.2f\nSoma da diagonal secundária: %.2f\nSoma de ambas as diagonais: %.2f", soma[0], soma[1], soma[2]);
        System.out.println(s);

        sc.close();
    }
}