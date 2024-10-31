package aplicacao;

import utilitarios.Aluno;
import utilitarios.Local;
import utilitarios.Professor;
import utilitarios.Seminario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie um aluno:");
        System.out.printf("Nome: ");
        String nome = sc.nextLine();
        System.out.printf("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Crie um seminario:");
        System.out.printf("Titulo: ");
        String titulo = sc.nextLine();
        System.out.printf("Local: ");
        String local = sc.nextLine();

        System.out.println("Crie um professor:");
        System.out.printf("Nome: ");
        String professor = sc.nextLine();
        System.out.printf("Especialidade: ");
        String especialidade = sc.nextLine();

        Local endereco = new Local(local);

        Professor prof = new Professor(professor, especialidade, new ArrayList<>());
        Aluno aluno = new Aluno(nome, idade, null);
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);


        ArrayList<Professor> profs = new ArrayList<>();
        profs.add(prof);

        Seminario seminario = new Seminario(titulo, alunos, profs, endereco);

        System.out.println(seminario.toString());

        sc.close();

    }

}
