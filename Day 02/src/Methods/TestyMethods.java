package Methods;

public class TestyMethods {

    //Void - pustota - Metoda nic nie zwraca
    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(int copyCount) {
        for (int i = 1; i <= copyCount; i++) {
            sayHello();
        }
    }

    public static void main(String[] args) {
        //robi methode sayHello
        sayHello();
        sayHello();
        sayHello(5);

    }

}
