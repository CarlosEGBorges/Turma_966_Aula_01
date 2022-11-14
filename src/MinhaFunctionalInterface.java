
@FunctionalInterface
public interface MinhaFunctionalInterface {
    public abstract void meuMetodoFuncional();
    public default String meuMetodoNaoFuncional(){
        return null;
    }
}
