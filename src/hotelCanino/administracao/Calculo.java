package hotelCanino.administracao;


public class Calculo {
    public double getValorFinal(CheckOut checkOut){
        double somaTotal = checkOut.getEstadia() +
                checkOut.getBanho() +
                checkOut.getTosa() +
                checkOut.getComida();

        return somaTotal;
    }
}
