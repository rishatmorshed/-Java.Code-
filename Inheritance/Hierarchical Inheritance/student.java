package Mahbub_Morshed;
import java.util.Scanner;
public class student extends person{
    Scanner in = new Scanner(System.in);
    double cgpa;
    int id;
    void inputst(){
        System.out.println("Enter student ID: ");
        id = in.nextInt();
        System.out.println("Enter student cgpa: ");
        cgpa = in.nextDouble();
    }
    void display2(){
        display();
        System.out.println("Student id: "+id);
        System.out.println("student cgpa: "+cgpa);
    }
}
