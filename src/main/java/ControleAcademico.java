import Control.AlunoDisciplina;
import Control.ProfessorDisciplina;
import Entidades.Disciplina;
import Tratamento.AlunoNaoEncontradoException;
import Tratamento.DisciplinaNaoEncontradaException;
import Tratamento.ProfessorNaoEncontradoException;

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

    //cadastros
    public void matricularAluno(String nome, int matricula) {
        AlunoDisciplina novoAluno = new AlunoDisciplina(nome, matricula);
        alunos.add(novoAluno);
    }

    public void matricularProfessor(String nome, int matricula) {
        ProfessorDisciplina novoProfessor = new ProfessorDisciplina(nome, matricula);
        professores.add(novoProfessor);
    }

    public void cadastrarDisciplina(String nome, String id, String inicio, String fim) {
        Disciplina novaDisciplina = new Disciplina(nome, id, inicio, fim);
        disciplinas.add(novaDisciplina);
    }

    //operações
    public AlunoDisciplina retornarAluno(int matricula) throws AlunoNaoEncontradoException {
        AlunoDisciplina alunoProcurado = null;
        for (AlunoDisciplina alunoNaLista : alunos) {
            if (alunoNaLista.getAluno().getMatricula() == matricula) {
                alunoProcurado = alunoNaLista;
                break;
            }
        }
        if (alunoProcurado != null) {
            return alunoProcurado;
        } else {
            throw new AlunoNaoEncontradoException("Aluno não encontrado com a matrícula especificada: " + matricula);
        }
    }
    public ProfessorDisciplina retornarProfessor(int matricula) throws ProfessorNaoEncontradoException {
        ProfessorDisciplina professorProcurado = null;
        for (ProfessorDisciplina professorNaLista : professores) {
            if (professorNaLista.getProfessor().getMatricula() == matricula) {
                professorProcurado = professorNaLista;
                break;
            }
        }
        if (professorProcurado != null) {
            return professorProcurado;
        } else {
            throw new ProfessorNaoEncontradoException("Aluno não encontrado com a matrícula especificada: " + matricula);
        }
    }
    public Disciplina retornarDisciplina(String id) throws DisciplinaNaoEncontradaException {
        Disciplina disciplinaProcurada = null;
        for (Disciplina disciplinaNaLista : disciplinas) {
            if (disciplinaNaLista.getId().equals(id)) {
                disciplinaProcurada = disciplinaNaLista;
                break;
            }
        }
        if (disciplinaProcurada != null) {
            return disciplinaProcurada;
        } else {
            throw new DisciplinaNaoEncontradaException("Disciplina não encontrada com esse id: " + id);
        }
    }

    //consultar quantos alunos em uma disciplina
    //usar os metodos de associar diciplinas

    //gets & sets
    public ArrayList<AlunoDisciplina> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoDisciplina> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<ProfessorDisciplina> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<ProfessorDisciplina> professores) {
        this.professores = professores;
    }
}