package t04.exe02;

import java.util.Scanner;
import java.io.IOException;

public class exe02 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        String endereco;
        Pessoa p = new Pessoa();
        Boolean x;
        String a;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        p.setNome(nome);

        do{
            x=true;
            System.out.print("Idade: ");
            a = sc.nextLine();
            try{
                idade = Integer.parseInt(a);
                p.setIdade(idade);
            }catch(NumberFormatException e){
                System.out.println("Insira um número inteiro.");
                x=false;
            }
        }while(x);

        System.out.print("Endereço: ");
        endereco = sc.nextLine();
        p.setEndereco(endereco);


        sc.close();
    }
}
