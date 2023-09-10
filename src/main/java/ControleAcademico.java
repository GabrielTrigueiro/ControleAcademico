import Control.AlunoDisciplina;
import Control.ProfessorDisciplina;
import Entidades.Aluno;
import Entidades.Disciplina;
import Entidades.Professor;
import Entidades.Horario;

import java.util.ArrayList;

public class ControleAcademico {

    private ArrayList<AlunoDisciplina> alunos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<ProfessorDisciplina> professores;

    public ControleAcademico() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void matricularAluno(String nome, int matricula) {
        AlunoDisciplina novoAluno = new AlunoDisciplina(nome, matricula);
        alunos.add(novoAluno);
    }

    public void matricularProfessor(String nome, int matricula) {
        ProfessorDisciplina novoProfessor = new ProfessorDisciplina(nome, matricula);
        professores.add(novoProfessor);
    }

    public void cadastrarDisciplina(String nome, String id, String inicio, String fim){
        Disciplina novaDisciplina = new Disciplina(nome, id, inicio, fim);
        disciplinas.add(novaDisciplina);
    }
}