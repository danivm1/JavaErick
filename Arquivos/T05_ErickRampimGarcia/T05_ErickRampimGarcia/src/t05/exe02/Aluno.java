package t05.exe02;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private int periodo;
    private ArrayList<String> disciplinasMatriculadas = new ArrayList<String>();
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
            return String.format("Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de %d disciplina(s).\nSe desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.", this.quantidadeDisciplinasPermitidadas);
        }else{
            this.disciplinasMatriculadas.add(disciplina);
            return String.format("Matrícula na disciplina %s executada.", disciplina);
        }
    }

    public String cancelaMatricula(String disciplina){
        if(this.disciplinasMatriculadas.size()==0){
            return "O aluno não está matriculado em nenhuma disciplina.";
        }
        for(int i=0; i<this.disciplinasMatriculadas.size(); i++){
            if(this.disciplinasMatriculadas.get(i).equals(disciplina)){
                this.disciplinasMatriculadas.remove(i);
                return String.format("Cancelamento da matrícula da disciplina %s executado com sucesso.", disciplina);
            }
        }
        return String.format("Aluno não está matriculado na disciplina %s,portanto não é possível cancelar esta matrícula.", disciplina);
    }

    public String listaDisciplinasAluno(){
        if(disciplinasMatriculadas.size() == 0){
            return "Nenhuma disciplina matriculada.";
        }
        
        String disc = disciplinasMatriculadas.get(0);
        
        for(int i=1; i<disciplinasMatriculadas.size(); i++){
            disc += "; " + disciplinasMatriculadas.get(i);
        }

        disc += ".";

        return disc;
    }

    public String imprime(){
        String disc = listaDisciplinasAluno();
        String s = String.format("Nome do aluno: %s\nMatricula: %s\nCurso: %s\nPeriodo: %d\nDisciplinas matriculadas: %s\n", nome, matricula, curso, periodo, disc);
        return s;
    }
}
