public class ControleAcademico {
    private Professor[] professores;
    private Aluno[] alunos;
    private Disciplina[] disciplinas;

    public ControleAcademico(Professor[] professores, Aluno[] alunos, Disciplina[] disciplinas) {
        this.professores = professores;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
}
