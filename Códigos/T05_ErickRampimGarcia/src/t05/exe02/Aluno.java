package t05.exe02;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private int periodo;
    private ArrayList<String> disciplinasMatriculadas;
    private String endereco;
    private int quantidadeDisciplinasPermitidadas;

    public Aluno(String nome, String matricula, String curso, int periodo, String endereco, int quantidadeDisciplinasPermitidadas){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.quantidadeDisciplinasPermitidadas = quantidadeDisciplinasPermitidadas;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public int getPeriodo(){
        return this.periodo;
    }

    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }

    public ArrayList<String> getDisciplinasMatriculadas(){
        return this.disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(ArrayList<String> disciplinasMatriculadas){
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getQuantidadeDisciplinasPermitidadas(){
        return this.quantidadeDisciplinasPermitidadas;
    }

    public void setQuantidadeDisciplinasPermitidadas(int quantidadeDisciplinasPermitidadas){
        this.quantidadeDisciplinasPermitidadas = quantidadeDisciplinasPermitidadas;
    }

    public String fazMatricula(String disciplina){
        if(this.quantidadeDisciplinasPermitidadas == 0){
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        }else if(this.disciplinasMatriculadas.size() == this.quantidadeDisciplinasPermitidadas){
            return String.format("Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de %d disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.", this.quantidadeDisciplinasPermitidadas);
        }else{
            this.disciplinasMatriculadas.add(disciplina);
            return String.format("Matrícula na disciplina %s executada.", disciplina);
        }
    }
}
