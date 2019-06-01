public class DriverSingleton {

    private static DriverSingleton instance;
    private String nome = "driver-type:owx.cartagena.max=350";


    private DriverSingleton() {

    }

    public static DriverSingleton getInstance() {
        if (instance == null) {
            instance = new DriverSingleton();
        }
        return instance;
    }

    public String parametroDeConf() {
        return nome;
    }
}
