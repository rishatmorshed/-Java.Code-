package Mahbub_Morshed;
import java.util.Scanner;
public class person {
    String name;
    String dep_name;
    Scanner in = new Scanner(System.in);
    void inputper(){
        System.out.println("Enter person name: ");
        name = in.nextLine();
        System.out.println("Enter department of person: ");
        dep_name = in.nextLine();
    }
    void display(){
        System.out.println("Person name: "+name);
        System.out.println("Person department: "+dep_name);
    }
}
