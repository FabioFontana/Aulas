public class Calculadora {

    private Integer n1;
    private Integer n2;
    private StrategyOperation strategyOperation;


    public Calculadora(StrategyOperation sp){

        this.strategyOperation = sp;
    }


    public void calcular(Integer n1, Integer n2) {
        this.strategyOperation.perform(n1,n2);
    }
}
