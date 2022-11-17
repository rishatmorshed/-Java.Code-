package Modifier1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your id: ");
        int id = sc.nextInt();
        A ob = new A();
        ob.setName(name);
        ob.setId(id);
        ob.output();
    }
}

