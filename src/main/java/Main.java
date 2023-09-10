import Control.AlunoDisciplina;
import Control.ProfessorDisciplina;
import Entidades.Horario;
import Entidades.Disciplina;

public class Main {
    public static void main(String[] args) {
        Disciplina mat = new Disciplina("Matemática", "12312321", "9:00", "11:00");
        Disciplina logica = new Disciplina("Lógica", "12321", "11:00", "13:00");

        AlunoDisciplina edson = new AlunoDisciplina("Gabriel", 123);
        edson.cadastrarDisciplina(mat);
        edson.cadastrarDisciplina(logica);
        edson.verificarDisciplinas();

        ProfessorDisciplina sabrina = new ProfessorDisciplina("Sabrina",213);
        sabrina.cadastrarDisciplina(mat);
        sabrina.verificarDisciplinas();
    }
}