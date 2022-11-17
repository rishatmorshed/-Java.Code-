package Constructor;

public class student {
    String name;
    int id;
    student(String n, int i){
        this.name = n;
        this.id = i;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
