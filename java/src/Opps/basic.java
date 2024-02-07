package Opps;

import com.sun.security.jgss.GSSUtil;

public class basic {
    public static void main(String[] args) {
//        Student st1 = new Student();
//        st1.name = "Aman";
//        st1.rollno = 151;
//        st1.marks = 95.6F;
//        System.out.println(st1.name);
        Student st1 = new Student("Aman",151);
//        System.out.println(st1.name);
//        Student st2 = new Student("aahna",003);
//        System.out.println(st2.name);
//        System.out.println(st2.rollno);
//        st1.greet();
//        st2.changeName("Akshat");
//        System.out.println(st2.name);
//        Student random = new Student(st1);
//        System.out.println(random.name);
//        System.out.println(random.rollno);
        Student random2 = new Student();
//        System.out.println(random2.name);
//        System.out.println(random2.rollno);
        Student one  =  new Student("something something",123);
        Student two = one;
        System.out.println(two.name);



    }
}
class Student {
    String name;
    int rollno;

    
    void changeName(String name){
        this.name = name;
    }
    void greet(){
        System.out.println("hello " + this.name);
    }
    Student(Student other){
        this.name = other.name;
        this.rollno = other.rollno;
    }

    Student(){
        this ("xyz",000);
    }
    // Student arpit = new Student (17, "arpit") ;
    // here, this will be replaced with arpit;
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}



