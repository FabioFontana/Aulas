public class Soma extends StrategyOperation {

    @Override
    public Integer perform(Integer n1, Integer n2) {

        Integer resultado = n1 + n2;

        System.out.println(resultado);
        return resultado;
    }
}
