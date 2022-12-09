package Mahbub_Morshed;
import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    void input4person(){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter ID: ");
        id = sc.nextInt();
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}
