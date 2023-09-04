import Control.Horario;
import Entidades.Disciplina;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Matemática", "12312321", new Horario("9:00", "11:00"));
        disciplina.consultarHorario();
    }
}