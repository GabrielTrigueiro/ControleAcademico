import org.junit.Assert;
import org.junit.Test;

public class AlunoTeste {
    @Test
    public void testDisciplinasAluno() {
        Disciplina[] disciplinas = {
                new Disciplina("map", "09:00", "11:00", new Aluno[]{}),
                new Disciplina("loac", "11:00", "13:00", new Aluno[]{}),
        };

        Aluno[] alunos = {
                new Aluno("Nícolas", disciplinas),
        };

        Disciplina[] disciplinasEsperadas = disciplinas;
        Disciplina[] disciplinasVindo = alunos[0].listarDisciplinasCursadas();
        Assert.assertArrayEquals(disciplinasEsperadas, disciplinasVindo);

    }

    @Test
    public void testHorariosAluno() {
        Disciplina[] disciplinas = {
                new Disciplina("map", "09:00", "11:00", new Aluno[]{}),
        };

        Aluno[] alunos = {
                new Aluno("Nícolas", disciplinas),
        };

        String[] horariosEsperados = {"09:00", "11:00"};
        String[] horarioVindo = alunos[0].horariosDeAula();
        Assert.assertArrayEquals(horariosEsperados, horarioVindo);
    }
}
