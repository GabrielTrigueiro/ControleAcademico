public class Main {
    public static void main(String[] args) {

        Disciplina[] disciplinas = {
                new Disciplina("map", "09:00", "11:00", new Aluno[]{}),
                new Disciplina("loac", "11:00", "13:00", new Aluno[]{}),
        };

        Aluno[] alunos = {
                new Aluno("Nícolas", new Disciplina[]{}),
                new Aluno("Gabriel", new Disciplina[]{}),
                new Aluno("Davison", new Disciplina[]{}),
        };

        Professor[] professores = {
                new Professor("Sabrina", new Disciplina[]{}),
        };

        alunos[0].setDisciplinasMatriculadas(disciplinas);
        alunos[1].setDisciplinasMatriculadas(new Disciplina[]{disciplinas[1]});
        alunos[2].setDisciplinasMatriculadas(new Disciplina[]{disciplinas[0]});

        alunos[0].listarDisciplinasCursadas();
        alunos[1].listarDisciplinasCursadas();
        alunos[2].listarDisciplinasCursadas();

        alunos[0].horariosDeAula();
        alunos[1].horariosDeAula();
        alunos[2].horariosDeAula();

        professores[0].setDisciplinasMinistradas(disciplinas);
        professores[0].listarDisciplinasMinistradas();
        professores[0].horariosDeAula();

        disciplinas[0].setAlunosMatriculados(new Aluno[]{alunos[0], alunos[1]});
        disciplinas[1].setAlunosMatriculados(new Aluno[]{alunos[0], alunos[2]});
        disciplinas[0].listarAlunosMatriculados();
        disciplinas[1].listarAlunosMatriculados();
        disciplinas[0].numeroDeMatriculados();
        disciplinas[1].numeroDeMatriculados();
    }
}
