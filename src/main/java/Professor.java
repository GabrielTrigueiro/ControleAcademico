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
    //lista as disciplinas que o professor ministra
    public Disciplina[] listarDisciplinasMinistradas() {
        int i = 0;
        Disciplina[] arrayDeObjetos = new Disciplina[this.getDisciplinasMinistradas().length];
        System.out.println("Professor(a) " + this.nome + " ministra:");
        for (Disciplina disciplina : disciplinasMinistradas) {
            System.out.println(disciplina.getNome());
            arrayDeObjetos[i] = disciplina;
            i++;
        }
        System.out.println();
        return arrayDeObjetos;
    }

    //lista os horarios que o professor ministra aula
    public Disciplina[] horariosDeAula() {
        int i = 0;
        Disciplina[] arrayDeObjetos = new Disciplina[this.getDisciplinasMinistradas().length];
        System.out.println(this.nome + " ministra aulas nos seguintes horários:");
        for (Disciplina disciplina : disciplinasMinistradas) {
            System.out.println(disciplina.getNome() + " Das " + disciplina.getHorarioInicio() + " até " + disciplina.getHorarioFim());
            arrayDeObjetos[i] = disciplina;
            i++;
        }
        System.out.println();
        return arrayDeObjetos;
    }
}
