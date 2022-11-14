import java.io.Serializable;

public class Aluno implements Participante, Pessoa {
    private Integer matricula;
    private String nome;
    private String apelido;

    public Aluno(Integer matricula, String nome, String apelido) {
        this.matricula = matricula;
        this.nome = nome;
        this.apelido = apelido;
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String getNomeParticipante(){
        return this.getApelido();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                '}';
    }

    @Override
    public int compareTo(Participante participante) {

        return getNomeParticipante().compareTo(participante.getNomeParticipante());
    }
}
