package Mahbub_Morshed;

public class Student {
    static int count = 0;
    Student(){
        count++;
        System.out.println(count); // without static count value always 1.
                                    //here count increase in each object call.
    }
}

