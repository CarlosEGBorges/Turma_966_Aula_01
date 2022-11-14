package hotelCanino;

public class PastorAlemao extends RacaCachorro{

    public PastorAlemao(String nome){
        super(nome, "ruforuforufo");
    }

    @Override
    public String toString() {
        return "RacaCachorro{" +
                "latido='" + this.getLatido() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                '}';
    }
}
