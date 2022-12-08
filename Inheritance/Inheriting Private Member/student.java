package Mahbub_Morshed;
import java.util.Scanner;
public class student extends person{
    Scanner in = new Scanner(System.in);
    private int age;
    private String qualification;
    void input4student(){
        System.out.println("Enter qualification: ");
        qualification = in.nextLine();
        System.out.println("Enter age: ");
        age = in.nextInt();
    }

    void display4student(){
        display4person();
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
