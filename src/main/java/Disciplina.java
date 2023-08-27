import java.util.List;

public class Disciplina {
    private String nome;
    private String horarioInicio;
    private String horarioFim;
    private Aluno[] alunosMatriculados;

    public Disciplina(String nome, String horarioInicio, String horarioFim, Aluno[] alunosMatriculados) {
        this.nome = nome;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.alunosMatriculados = alunosMatriculados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public Aluno[] getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(Aluno[] alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    //lista os alunos matriculados na disciplina
    public void listarAlunosMatriculados(){
        System.out.println("Alunos matriculados em " + this.nome + ":");
        for (Aluno aluno : alunosMatriculados) {
            System.out.println(aluno.getNome());
        }
        System.out.println();
    }

    //diz a quantidade de alunos na disciplina
    public void numeroDeMatriculados(){
        System.out.println("Em " + this.nome + " tem " + this.alunosMatriculados.length + " alunos matriculados");
    }
}
