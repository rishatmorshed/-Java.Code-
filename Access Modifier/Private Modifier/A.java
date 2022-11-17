package Modifier1;

public class A {
    private String name;
    private int id;

    private void display(){
        System.out.println("Your name is: "+name);
        System.out.println("Your id is: "+id);
    }
    public void output(){
        display();
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
