package hotelCanino.administracao;

import java.util.List;

public class Financeiro {

    public static void getRelatorioFinanceiro(List<RegistroContabil> registroContabeis){
        registroContabeis.forEach(
                x -> System.out.println("Registro Contabil do cachorro: " +
                        x.cachorro() + " valor: R$" + x.valorFinal())
        );
    }
}
