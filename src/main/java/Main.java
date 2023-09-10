import Control.AlunoDisciplina;
import Control.ProfessorDisciplina;
import Entidades.Disciplina;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ControleAcademico controle = new ControleAcademico();


        controle.matricularAluno("Gabriel", 123);
        controle.cadastrarDisciplina("Matemática", "12312321", "9:00", "11:00");
        controle.cadastrarDisciplina("Lógica", "12321", "11:00", "13:00");
        controle.matricularProfessor("Sabrina",213);


        ArrayList<AlunoDisciplina> alunos = controle.getAlunos();
        ArrayList<Disciplina> disciplinas = controle.getDisciplinas();
        ArrayList<ProfessorDisciplina> professores = controle.getProfessores();

        alunos.get(0).cadastrarDisciplina(disciplinas.get(0));
        alunos.get(0).verificarDisciplinas();
    }
}