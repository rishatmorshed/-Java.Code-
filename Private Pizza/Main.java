package Evaluation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Enter size of the Pizza: ");
        int size = in.nextInt();
        System.out.print("Enter number of cheese toppings: ");
        int cht = in.nextInt();
        System.out.print("Enter number of pepperoni toppings: ");
        int ppt = in.nextInt();
        Pizza p1 = new Pizza();
        p1.setSize(size);
        p1.setCheese_toppings(cht);
        p1.setPrpperoni_toppings(ppt);
        p1.display();

    }
}
