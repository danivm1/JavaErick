package t04.exe02;

import java.util.Scanner;
import java.io.IOException;

public class Exe02 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade = 0;
        String endereco;
        Pessoa p;
        Boolean x;
        String a;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        // p.setNome(nome);

        do{
            x=false;
            System.out.print("Idade: ");
            a = sc.nextLine();
            try{
                idade = Integer.parseInt(a);
                // p.setIdade(idade);
            }catch(NumberFormatException e){
                System.out.println("Insira um número inteiro.");
                x=true;
            }
        }while(x);

        System.out.print("Endereço: ");
        endereco = sc.nextLine();
        // p.setEndereco(endereco);

        p = new Pessoa(nome, idade, endereco);

        System.out.println(String.format("%s está fazendo aniversário? s/n", p.getNome()));
        do{
            a = sc.nextLine();
            if(a.equals("s")){
                p.fazAniversario();
                break;
            }else if(a.equals("n")){
                break;
            }else{
                System.out.println("Digite apenas 's' para ou 'n' para não.");
            }
        }while(true);


        p.imprime();

        sc.close();
    }
}
