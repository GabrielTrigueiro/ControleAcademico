package Control;

import Entidades.Professor;

import java.util.ArrayList;

public class ControleProfessores {
    private ArrayList<Professor> professores = new ArrayList<>();

    public boolean adicionarProfessor(Professor professor) {
        professores.add(professor);
        return professores.contains(professor);
    }

    public boolean removerProfessor(int matricula) {
        boolean deuCerto = false;
        for (Professor professor : professores) {
            if (professor.getMatricula() == matricula) {
                professores.remove(professor);
                deuCerto = true;
                break;
            }
        }
        System.out.println("Professor não existe.");
        return deuCerto;
    }
}
