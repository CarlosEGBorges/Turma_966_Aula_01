public class Professor implements Participante, Pessoa {

    private Integer matricula;
    private String nome;
    private String disciplina;

    public Professor(Integer matricula, String nome, String disciplina) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String getNomeParticipante(){
        return "Prof. " + this.getNome() + " - " + this.getDisciplina();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    @Override
    public int compareTo(Participante participante) {
        return getNomeParticipante().
                compareTo(participante.getNomeParticipante());
    }
}
