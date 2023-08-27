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
    public void listarDisciplinasCursadas(){
        System.out.println(this.nome + " está cursando: ");
        for(Disciplina disciplina : disciplinasMatriculadas){
            System.out.println(disciplina.getNome());
        }
        System.out.println();
    }

    //lista os horarios que o professor ministra aula
    public void horariosDeAula(){
        System.out.println(this.nome + " tem aula nos seguintes horários:");
        for(Disciplina disciplina: disciplinasMatriculadas){
            System.out.println(disciplina.getNome() + " Das " + disciplina.getHorarioInicio() + " até " + disciplina.getHorarioFim());
        }
        System.out.println();
    }

}
