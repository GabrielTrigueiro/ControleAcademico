import org.junit.Assert;
import org.junit.Test;

public class ProfessorTeste {

    @Test
    public void testListarDisciplinasMinistradas(){

        Disciplina[] disciplinas = {
                new Disciplina("map", "09:00", "11:00", new Aluno[]{}),
                new Disciplina("loac", "11:00", "13:00", new Aluno[]{}),
        };

        Professor[] professores = {
                new Professor("Sabrina", disciplinas),
        };

        Disciplina[] disciplinasEsperadas = disciplinas;
        Disciplina[] disciplinasVindo = professores[0].listarDisciplinasMinistradas();
        Assert.assertArrayEquals(disciplinasEsperadas, disciplinasVindo);

    }
    @Test
    public void testHorariosProfessor() {
        Disciplina[] disciplinas = {
                new Disciplina("map", "09:00", "11:00", new Aluno[]{})
        };

        Professor[] professor = {
                new Professor("Nícolas", disciplinas),
        };

        Disciplina[] horariosEsperados = disciplinas;
        Disciplina[] horarioVindo = professor[0].horariosDeAula();
        Assert.assertEquals(horariosEsperados, horarioVindo);
    }


}
