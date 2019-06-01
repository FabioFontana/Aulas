public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 0 , fib = 1;

        while(fib <= 100) {
            System.out.println(a + " " + fib + " ");
            a += fib;
            fib += a;

        }
    }
}
