package hotelCanino;

public class RacaCachorro implements Cachorro {
    private String latido;
    private String nome;

    public RacaCachorro(String nome, String latido){
        this.latido = latido;
        this.nome = nome;
    }

    @Override
    public String latir(){
        return this.latido;
    }

    @Override
    public int compareTo(Cachorro cachorro){
        String nome = this.getNome();
        return nome.compareToIgnoreCase(cachorro.getNome());
    }

    public String getNome(){
        return this.nome;
    }

    public String getLatido(){
        return this.latido;
    }

}
