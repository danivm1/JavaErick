package t04.exe02;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void fazAniversario(){
        this.idade++;
    }

    public void imprime(){
        String s = String.format("nome: %s\nidade: %d\nendereco: %s", this.nome, this.idade, this.endereco);
        System.out.println(s);
    }
}
