package se.iths.pierre;

public class Main {
    static void main() {


        int sum = add(12, 15);
        int result = sub(15, 12);
        int result2 = mult(33, 18);
        int result3 = div(33, 6);

        IO.println(result);
        IO.println(sum);
        IO.println(result2);
        IO.println(result3);

    }

    private static int add(int a, int b) {
        return a + b;

    }

    private static int sub(int a, int b) {
        return a - b;

    }

    private static int mult(int a, int b) {
        return a * b;

    }

    private static int div(int a, int b) {
        return a / b;
    }
}






