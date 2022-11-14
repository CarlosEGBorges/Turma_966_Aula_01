import java.util.Comparator;

public class ComparaParticipanteMatricula
        implements Comparator<Participante> {

    public int compare(Participante p1, Participante p2){
        return p1.getMatricula()
                .compareTo(p2.getMatricula());
    }
}
