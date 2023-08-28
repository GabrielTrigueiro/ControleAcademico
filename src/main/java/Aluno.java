import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Disciplina[] disciplinasMatriculadas;

    public Aluno(String nome, Disciplina[] disciplinasMatriculadas) {
        this.nome = nome;
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(Disciplina[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    //lista as disciplinas que o aluno está cursando
    public Disciplina[] listarDisciplinasCursadas(){
        int i = 0;
        Disciplina[] arrayDeObjetos = new Disciplina[this.disciplinasMatriculadas.length];
        System.out.println(this.nome + " está cursando: ");
        for(Disciplina disciplina : disciplinasMatriculadas){
            System.out.println(disciplina.getNome());
            arrayDeObjetos[i] = disciplina;
            i++;
        }
        System.out.println();
        return arrayDeObjetos;
    }

    //lista os horarios que o professor ministra aula
    public String[] horariosDeAula(){
        int i = 0;
        String[] arrayDeObjetos = new String[this.disciplinasMatriculadas.length * 2];
        System.out.println(this.nome + " tem aula nos seguintes horários:");
        for(Disciplina disciplina: disciplinasMatriculadas){
            System.out.println(disciplina.getNome() + " Das " + disciplina.getHorarioInicio() + " até " + disciplina.getHorarioFim());
            arrayDeObjetos[i] = disciplina.getHorarioInicio();
            i++;
            arrayDeObjetos[i] = disciplina.getHorarioFim();
            i++;
        }
        System.out.println();
        return arrayDeObjetos;
    }
}
