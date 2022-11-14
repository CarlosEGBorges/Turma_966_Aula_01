public interface Participante
        extends Comparable<Participante> {
    public abstract String getNomeParticipante();
    public abstract Integer getMatricula();
    public abstract int compareTo(Participante participante);
}
