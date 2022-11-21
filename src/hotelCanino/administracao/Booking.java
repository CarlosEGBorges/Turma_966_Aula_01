package hotelCanino.administracao;

import java.util.ArrayList;
import java.util.List;

public class Booking <T extends Hospede>  {

    private List<T> hospedes = new ArrayList<>();

    public List<T> getHospedes(){
        return this.hospedes;
    }

    public T getHospede(Integer numeroRegistro){
        for(T t : hospedes){
            if(t.getNumeroRegistro().equals(numeroRegistro)){
                return t;
            }
        }
        return null;
    }

    public void addHospede(T hospede){
        if(hospedes.contains(hospede) == false){
            hospedes.add(hospede);
        }
    }

    public void deleteHospede(T hospede){
        hospedes.remove(hospede);
    }
}
