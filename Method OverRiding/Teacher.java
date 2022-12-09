package Mahbub_Morshed;
import java.util.Scanner;

public class Teacher extends Person {
    Scanner in = new Scanner(System.in);
    String qualification;
    void input4teacher(){
        System.out.println("Enter Teacher name: ");
        name = in.nextLine();
        System.out.println("Enter Qualification: ");
        qualification = in.nextLine();
        System.out.println("Enter Teacher Id: ");
        id = in.nextInt();
    }
    @Override
    void display(){
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher id: "+id);
        System.out.println("Teacher qualification: "+qualification);
    }
}
