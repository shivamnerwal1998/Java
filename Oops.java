package com.company;
import java.util.Scanner ;
class Intro {
    int rollno ;
    String name ;
    public void studentName()
    {
        System.out.println("my name is : " + name );
    }
    public int studentRollno()
    {
        return rollno ;
    }

}
public class Oops{
    public static void main(String[]args)
    {
        System.out.println("\n enter the student name  \n");
        Scanner sc  = new Scanner(System.in) ;
        String name = sc.next() ;
        System.out.println("\n enter the roll number  \n");
        int rollno = sc.nextInt() ;
        Intro student1 = new Intro() ;
        student1.name = name ;
        student1.rollno = rollno ;
        student1.studentName() ;
        System.out.println("Roll no : " + student1.studentRollno() );


    }
}
