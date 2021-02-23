package t05.exe02;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class SistemaAcademico {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public static void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public static void excluirAlunoPorNome(String nomeAluno){
        int cont=0;
        for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).getNome().equals(nomeAluno)){
                alunos.remove(i);
                System.out.println(String.format("O aluno %s foi removido com sucesso.", nomeAluno));
                cont++;
            }
        }
        if(cont==0){
            System.out.println(String.format("Nenhum aluno de nome %s encontrado.", nomeAluno));
        }
    }

    public static String[] listarAlunos(){
        String[] listaAlunos = new String[alunos.size()];
        for(int i=0; i<alunos.size(); i++){
            listaAlunos[i] = alunos.get(i).getNome();
        }
        return listaAlunos;
    }

    public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina){
        return aluno.fazMatricula(disciplina);
    }

    public static String cancelarMatricula(Aluno aluno, String disciplina){
        return aluno.cancelaMatricula(disciplina);
    }

    public static String imprimirListaDeAlunoseDisciplinas(){
        String lista = "";
        String disc;
        try{
            alunos.get(0).getNome();
        }catch(IndexOutOfBoundsException e){
            return "Nenhum aluno cadastrado";
        }
        for(int i=0; i<alunos.size(); i++){
            disc = alunos.get(i).listaDisciplinasAluno();
            lista += "\n" + alunos.get(i).getNome() + ": " + disc;
        }

        return lista;
    }



    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela
        
        boolean repetir = true;
        do{
            System.out.println("\nEscolha uma operação:\n1 - Cadastrar Aluno\n2 - Excluir aluno por nome\n3 - Listar Alunos\n4 - Matricular Aluno em Disciplina\n5 - Cancelar Matricula\n6 - Imprimir Lista de Alunos e Disciplinas Matriculadas\n7 - Para finalizar");
            int operacao;
            do{
                String sOperacao = sc.next();
                try{
                    operacao = Integer.parseInt(sOperacao);
                    if(operacao<1 || operacao>7){
                        System.out.println("Opção inválida.");
                    }else{
                        break;
                    }
                }catch(NumberFormatException e){
                    System.out.println("Insira um número inteiro.");
                }
            }while(true);

            switch(operacao){
                case 1:
                    System.out.println("\nCadastrar aluno");

                    System.out.print("nome: ");
                    String nome = sc.next();

                    System.out.print("matricula: ");
                    String matricula = sc.next();

                    System.out.print("curso: ");
                    String curso = sc.next();

                    System.out.print("periodo: ");
                    int periodo;
                    do{
                        String sPeriodo = sc.next();
                        try{
                            periodo = Integer.parseInt(sPeriodo);
                            break;
                        }catch(NumberFormatException e){
                            System.out.println("Insira um número inteiro.");
                        }
                    }while(true);
                
                    System.out.print("endereco: ");
                    String endereco = sc.next();
                
                    System.out.print("quantidadedisciplinas: ");
                    int qntDisc;
                    do{
                        String sQntDisc = sc.next();
                        try{
                            qntDisc = Integer.parseInt(sQntDisc);
                            break;
                        }catch(NumberFormatException e){
                            System.out.println("Insira um número inteiro.");
                        }
                    }while(true);

                    Aluno aluno = new Aluno(nome, matricula, curso, periodo, endereco, qntDisc);

                    cadastrarAluno(aluno);

                    break;
                
                case 2:
                    System.out.print("\nDeletar aluno\nInsira o nome:");
                    String nomeAluno = sc.next();
                    excluirAlunoPorNome(nomeAluno);

                    break;

                case 3:
                    System.out.println("\nLista de alunos:");
                    String[] listaAlunos = listarAlunos();

                    for(int i=0; i<alunos.size(); i++){
                        System.out.println(listaAlunos[i]);
                    }

                    break;
                
                case 4:
                    System.out.println("\nMatricular aluno em diciplina");

                    System.out.print("Nome do aluno:");
                    int cont=0;
                    nomeAluno = sc.next();
                    for(int i=0; i<alunos.size(); i++){
                        if(alunos.get(i).getNome().equals(nomeAluno)){
                            System.out.print("Nome da disciplina:");
                            String nomeDisciplina = sc.next();

                            System.out.println(matricularAlunoEmDisciplina(alunos.get(i), nomeDisciplina));
                            cont++;
                        }
                    }
                    if(cont==0){
                        System.out.println(String.format("Nenhum aluno de nome %s encontrado.", nomeAluno));
                    }
                
                    break;

                case 5:
                    System.out.println("\nCancelar matricula de disciplina:");

                    System.out.print("Nome do aluno:");
                    cont=0;
                    nomeAluno = sc.next();
                    for(int i=0; i<alunos.size(); i++){
                        if(alunos.get(i).getNome().equals(nomeAluno)){
                            System.out.print("Nome da disciplina:");
                            String nomeDisciplina = sc.next();

                            System.out.println(cancelarMatricula(alunos.get(i), nomeDisciplina));
                            cont++;
                        }
                    }
                    if(cont==0){
                        System.out.println(String.format("Nenhum aluno de nome %s encontrado.", nomeAluno));
                    }
                    

                    break;
                
                case 6:
                    System.out.println("\nLista de alunos e suas disciplinas:");
                    System.out.println(imprimirListaDeAlunoseDisciplinas());

                    break;

                case 7:
                    repetir = false;
                default:
                    break;
            }
        }while(repetir);
        
        sc.close();
    }
}
