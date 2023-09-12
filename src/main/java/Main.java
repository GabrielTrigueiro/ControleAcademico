public class Main {
    public static void main(String[] args) {

        ControleAcademico controle = new ControleAcademico();

        controle.matricularAluno("Gabriel", 123);
        controle.cadastrarDisciplina("Matemática", "12312321", "9:00", "11:00");
        controle.cadastrarDisciplina("Lógica", "12321", "11:00", "13:00");
        controle.matricularProfessor("Sabrina",213);


    }
}