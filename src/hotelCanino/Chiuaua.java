package hotelCanino;

public class Chiuaua extends RacaCachorro{

    public Chiuaua(String nome){
        super(nome, "aiaiaiaiaia");
    }

    @Override
    public String toString() {
        return "RacaCachorro{" +
                "latido='" + this.getLatido() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                '}';
    }
}
