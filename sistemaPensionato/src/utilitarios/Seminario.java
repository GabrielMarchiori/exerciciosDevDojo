package utilitarios;

import java.util.ArrayList;

public class Seminario {
    private String titulo;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private Local endereco;

    public Seminario(String titulo, ArrayList<Aluno> alunos, ArrayList<Professor> professores, Local endereco) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professores = professores;
        this.endereco = endereco;
    }

    public Seminario(String titulo, ArrayList<Professor> professores, Local endereco) {
        this.titulo = titulo;
        this.professores = professores;
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public Local getEndereco() {
        return endereco;
    }

    public void setEndereco(Local endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Seminario{" +
                "titulo='" + titulo + '\'' +
                ", alunos=" + alunos +
                ", professores=" + professores +
                ", endereco=" + endereco +
                '}';
    }
}
