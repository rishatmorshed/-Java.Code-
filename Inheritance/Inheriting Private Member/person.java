package Mahbub_Morshed;
import java.util.Scanner;
public class person {
    Scanner in = new Scanner(System.in);
    private String name;
    private int id;

    void input4person(){
        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter id: ");
        id = in.nextInt();
    }

    void display4person(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
