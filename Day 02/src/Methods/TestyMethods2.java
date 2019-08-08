package Methods;

public class TestyMethods2 {
    int multiply(int a, int b) {
        return a * b;
    }
    int sum(int a, int b) {
        return a + b;
    }
    static void sayHello(){
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        TestyMethods2 main = new TestyMethods2();
        System.out.println(main.sum(5, 7));
        System.out.println(main.multiply(9, 8));
        int score = main.sum(2,100);
        System.out.println(score);

        TestyMethods.sayHello();
        sayHello();
        TestyMethods2.sayHello();

    }



}
