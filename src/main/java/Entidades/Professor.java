package Entidades;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private int matricula;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, int matricula, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}