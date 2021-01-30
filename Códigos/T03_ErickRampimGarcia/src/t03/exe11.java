package t03;

import java.util.Scanner;
import java.io.IOException;
import java.lang.NumberFormatException;

public class exe11 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        int m = 3;
        String a;
        double[][] mat = new double[m][m];
        int i;
        int j;

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

        double[] aux = {1,1,1,1,1,1};

        // diagonal principal
        for(i=0; i<m; i++){
            j=i;
            aux[0] *= mat[i][j];
        }
        for(i=0; i<m; i++){
            j=i+1;
            if(j==3){
                j=0;
            }
            aux[1] *= mat[i][j];
        }
        for(i=0; i<m; i++){
            j=m-i*2-1;
            if(j==-2){
                j=1;
            }
            aux[2] *= mat[i][j];
        }
        // diagonal secundária
        for(i=0; i<m; i++){
            j=m-i-1;
            aux[3] *= mat[i][j];
        }
        for(i=0; i<m; i++){
            j=m-i-2;
            if(j==-1){
                j=2;
            }
            aux[4] *= mat[i][j];
        }
        for(i=0; i<m; i++){
            j=m-i;
            if(j==3){
                j=0;
            }
            aux[5] *= mat[i][j];
        }

        double det = 0;

        for(i=0; i<6; i++){
            if(i<=2){
                det += aux[i];
            }else{
                det -= aux[i];
            }
        }

        System.out.println(String.format("%.2f", det));

        sc.close();
    }
}