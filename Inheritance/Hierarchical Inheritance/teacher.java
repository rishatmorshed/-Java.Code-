package Mahbub_Morshed;
import java.util.Scanner;
public class teacher extends person {
    int id;
    double salary;
    Scanner in = new Scanner(System.in);
    void inputtec(){
        System.out.println("Enter Teacher id: "+id);
        id = in.nextInt();
        System.out.println("Enter Amount of teacher salary: "+salary);
        salary = in.nextDouble();
    }
    void display1(){
        display();
        System.out.println("Teacher id: "+id);
        System.out.println("Teacher salary: "+salary);
    }
}
