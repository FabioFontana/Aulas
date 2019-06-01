public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

      Calculadora calculadora = new Calculadora(new Soma());
      calculadora.calcular(1,3);

        Calculadora calculadora1 = new Calculadora(new Subtracao());
        calculadora1.calcular(4,1);
    }
}
