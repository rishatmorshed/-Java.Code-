package Mahbub_Morshed;

public class Student {
    String name;  //This is instance variable.
    int id;  //This is instance variable.
    static String University_name = "Harvard University"; //This is static variable.

    Student(String n, int i){
        name = n;
        id = i;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University Name: "+University_name);
    }
}
