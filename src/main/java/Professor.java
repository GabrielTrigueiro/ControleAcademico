import java.util.List;

public class Professor {
    private String nome;
    private Disciplina[] disciplinasMinistradas;

    public Professor(String nome, Disciplina[] disciplinasMinistradas) {
        this.nome = nome;
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(Disciplina[] disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    //lista as disciplinas que o professor ministra
    public void listarDisciplinasMinistradas(){
        System.out.println("Professor(a) " + this.nome + " ministra:");
        for(Disciplina disciplina: disciplinasMinistradas){
            System.out.println(disciplina.getNome());
        }
        System.out.println();
    }

    //lista os horarios que o professor ministra aula
    public void horariosDeAula(){
        System.out.println(this.nome +  " ministra aulas nos seguintes horários:");
        for(Disciplina disciplina: disciplinasMinistradas){
            System.out.println(disciplina.getNome() + " Das " + disciplina.getHorarioInicio() + " até " + disciplina.getHorarioFim());
        }
        System.out.println();
    }
}
