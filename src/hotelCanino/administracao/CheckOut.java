package hotelCanino.administracao;

import hotelCanino.Cachorro;

public class CheckOut {
    private double estadia;
    private double comida;
    private double banho;
    private double tosa;

    private Cachorro cachorro;

    public CheckOut(Cachorro cachorro, double estadia, double comida, double banho, double tosa) {
        this.cachorro = cachorro;
        this.estadia = estadia;
        this.comida = comida;
        this.banho = banho;
        this.tosa = tosa;
    }

    public Cachorro getCachorro(){
        return this.cachorro;
    }

    public void setCachorro(Cachorro cachorro){
        this.cachorro = cachorro;
    }

    public double getEstadia() {
        return estadia;
    }

    public void setEstadia(double estadia) {
        this.estadia = estadia;
    }

    public double getComida() {
        return comida;
    }

    public void setComida(double comida) {
        this.comida = comida;
    }

    public double getBanho() {
        return banho;
    }

    public void setBanho(double banho) {
        this.banho = banho;
    }

    public double getTosa() {
        return tosa;
    }

    public void setTosa(double tosa) {
        this.tosa = tosa;
    }

    public double getValorFinal(Calculo calculo){
        return calculo.getValorFinal(this);
    }
}
