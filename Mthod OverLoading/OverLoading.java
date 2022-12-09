package Mahbub_Morshed;

public class OverLoading {
    void add() {
        System.out.println("Nothing to add");
    }

    void add(int a, int b) {
        System.out.println("Addition of two number: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Addition of two decimal number: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Addition of three number: " + (a + b + c));
    }
}
