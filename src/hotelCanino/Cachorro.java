package hotelCanino;

import hotelCanino.administracao.Hospede;

public abstract class Cachorro extends Hospede implements Comparable<Cachorro> {
    public abstract String latir();
    public abstract String getNome();
}
