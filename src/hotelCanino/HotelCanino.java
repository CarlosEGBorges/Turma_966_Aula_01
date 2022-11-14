package hotelCanino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelCanino {
    private static List<Cachorro> hospedes = new ArrayList<>();

    public static void main(String[] args){
        hospedes.add(new Chiuaua("totó"));
        hospedes.add(new Chiuaua("bebê"));
        hospedes.add(new PastorAlemao("Bob"));
        hospedes.add(new PastorAlemao("Pitu"));
        hospedes.add(new PitBull("Caramelo"));

        Collections.sort(hospedes);

        hospedes.forEach(c -> System.out.println(c));
    }
}
