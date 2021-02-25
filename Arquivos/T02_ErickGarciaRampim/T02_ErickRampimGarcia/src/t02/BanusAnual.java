package t02;

import java.util.Scanner;

public class BanusAnual {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual salário atual?");
        double salario = sc.nextDouble();
        
        System.out.println("Qual cargo do funcionário?\n1-Diretor\n2-Gerente\n3-Analista\n4-Programador\n5-Auxiliar de limpeza");
        int cargo = sc.nextInt();

        double bonus = 0;
        switch (cargo) {
            case 1:
                System.out.print("Quantos departamentos este gerencia? ");
                int qntDep = sc.nextInt();
                bonus = 4 * salario + 3000.00 * qntDep;
                break;
            case 2:
                System.out.print("Quantas pessoas este gerencia? ");
                int qntPessoa = sc.nextInt();
                bonus = 2 * salario  + 100.00 * qntPessoa;
                break;
            case 3:
                bonus = salario;
                break;
            case 4:
                bonus = 0.8 * salario;
                break;
            case 5:
                bonus = 0.5 * salario;
                break;
        
            default:
                System.out.println("Cargo inválido");
                sc.close();
                return;
        }
        
        String sBonus = String.format("O funcionário receberá R$%.2f de bonus.", bonus);
        System.out.println(sBonus);

        sc.close();
    }
}