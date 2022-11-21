package hotelCanino;

import hotelCanino.administracao.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelCanino {
    private static Booking<Cachorro> hospedesCaninos = new Booking<>();
    private static Booking<Gato> hospedesFelinos = new Booking<>();
    private static Booking<Passaro> hospedesQueVoam = new Booking<>();

    public static void main(String[] args){

        hospedesCaninos.addHospede(new Chiuaua("totó"));
        hospedesCaninos.addHospede(new Chiuaua("bebê"));
        hospedesCaninos.addHospede(new PastorAlemao("Bob"));
        hospedesCaninos.addHospede(new PastorAlemao("Pitu"));
        hospedesCaninos.addHospede(new PitBull("Caramelo"));

        hospedesFelinos.addHospede(new Gato());

        hospedesCaninos.getHospedes().forEach(c -> c.latir());
        hospedesCaninos.getHospedes().forEach(c -> sair(c));

        Financeiro.getRelatorioFinanceiro(RegistroContabil.livroContabil);
    }

    public static void sair(Cachorro cachorro){

        double valor = Secretaria.getValorCheckOut(
                cachorro, 1, 2, 3, 4
        );

        System.out.println(valor);
    }
}
