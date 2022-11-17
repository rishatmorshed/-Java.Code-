package Constructor;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        student ob1 = new student("Morshed", 2114); // set value during creat an object(called constructor);
        student ob2 = new student("Rishat", 211403);
        ob1.display();
        ob2.display();
    }
}
