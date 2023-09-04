package Control;

import Entidades.Aluno;

import java.util.ArrayList;

public class ControleAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public boolean adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        return alunos.contains(aluno);
    }

    public boolean removerAluno(int matricula) {
        boolean deuCerto = false;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
                deuCerto = true;
                break;
            }
        }
        System.out.println("Aluno não existe.");
        return deuCerto;
    }
}
