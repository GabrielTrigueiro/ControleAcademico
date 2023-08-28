import org.junit.Assert;
import org.junit.Test;

public class DisciplinaTeste {
    @Test
    public void testNumeroMatriculados() {
        Aluno[] alunos = {
                new Aluno("Nícolas", new Disciplina[]{}),
                new Aluno("Gabriel", new Disciplina[]{}),
                new Aluno("Davison", new Disciplina[]{}),
        };

        Disciplina[] disciplinas = {
                new Disciplina("map", "09:00", "11:00", new Aluno[]{}),
                new Disciplina("loac", "11:00", "13:00", new Aluno[]{}),
        };

        disciplinas[0].setAlunosMatriculados(new Aluno[]{alunos[0], alunos[1]});
        disciplinas[1].setAlunosMatriculados(new Aluno[]{alunos[0], alunos[2]});

        int numeroFinal = disciplinas[0].numeroDeMatriculados();
        int numeroEsperado = disciplinas[0].getAlunosMatriculados().length;
        Assert.assertEquals(numeroEsperado, numeroFinal);
    }

    @Test
    public void testAlunosMatriculados() {
        Aluno[] alunos = {
                new Aluno("Nícolas", new Disciplina[]{}),
                new Aluno("Gabriel", new Disciplina[]{}),
                new Aluno("Davison", new Disciplina[]{}),
        };

        Disciplina[] disciplinas = {
                new Disciplina("map", "09:00", "11:00", new Aluno[]{alunos[0], alunos[1]}),
        };

        int numeroEsperado = disciplinas[0].getAlunosMatriculados().length;
        int numeroVindo = disciplinas[0].listarAlunosMatriculados().length;
        Assert.assertEquals(numeroEsperado, numeroVindo);
    }
}
