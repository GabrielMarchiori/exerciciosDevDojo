package utilitarios;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private String especialidade;
    private ArrayList<Seminario> seminarios;

    public Professor(String nome, String especialidade, ArrayList<Seminario> seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(ArrayList<Seminario> seminarios) {
        this.seminarios = seminarios;
    }
}
