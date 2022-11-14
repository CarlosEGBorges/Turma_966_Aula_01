package hotelCanino;

public class PitBull implements Cachorro, Comparable<Cachorro> {
    private String nome;

    public PitBull(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String latir(){
        return "awrawrawrawrawr";
    }

    @Override
    public int compareTo(Cachorro cachorro){
        return this.getNome().toLowerCase().compareTo(cachorro.getNome().toLowerCase());
    }

    @Override
    public String toString() {
        return "PitBull{" +
                "latido='" + this.latir() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                '}';
    }
}
