package hotelCanino.administracao;

import hotelCanino.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {

    private static List<CheckOut> checkOuts = new ArrayList<>();

    public static double getValorCheckOut(Cachorro cachorro, double estadia, double comida, double banho, double tosa){

        CheckOut novoCheckOut = new CheckOut(
                cachorro, estadia, comida, banho, tosa
        );

        checkOuts.add(novoCheckOut);
        Calculo calculo = null;

        // só estadia
        if(comida == 0.0 && banho == 0.0 && tosa == 0.0){
            calculo = new CalculoSoEstadia();
        } else if(comida == 0.0 && tosa == 0.0)  { // banho e estadia
            calculo = new CalculoSoBanhoEEstadia();
        } else {
            calculo = new Calculo();
        }

        return novoCheckOut.getValorFinal(calculo);
    }

    public static List<CheckOut> getCheckOuts(){
        return checkOuts;
    }
}
