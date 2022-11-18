package hotelCanino;

import hotelCanino.administracao.Financeiro;
import hotelCanino.administracao.RegistroContabil;
import hotelCanino.administracao.Secretaria;

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

        hospedes.forEach(c -> c.latir());

        hospedes.forEach(c -> sair(c));

        Financeiro.getRelatorioFinanceiro(RegistroContabil.livroContabil);
    }

    public static void sair(Cachorro cachorro){

        double valor = Secretaria.getValorCheckOut(
                cachorro, 1, 2, 3, 4
        );

        System.out.println(valor);
    }
}
