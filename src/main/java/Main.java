import Tratamento.NaoEncontradoException;

public class Main {
    public static void main(String[] args) throws NaoEncontradoException {

        ControleAcademico controle = new ControleAcademico();

        controle.matricularAluno("Gabriel", 123);
        controle.cadastrarDisciplina("Matemática", "12312321", "9:00", "11:00");
        controle.cadastrarDisciplina("Lógica", "12321", "11:00", "13:00");
        controle.matricularProfessor("Sabrina",213);

        controle.adicionarDisciplinaAoAluno(123, "12321");
    }
}