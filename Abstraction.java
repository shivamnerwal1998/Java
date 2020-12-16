package com.company ;

import java.util.Scanner ;

class Student{
    private int rollNo ;
    private String name ;

    void setName(String name )
    {
        this.name = name ;

    }
    void setRollNo(int rollNo)
    {
        this.rollNo = rollNo ;

    }
    String getName()
    {
        return name ;

    }
    int getRollNo()
    {
        return rollNo ;

    }


}

public class Abstraction{
    public static void main(String[]args)
    {
        String name ;
        int rollNo ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("\n Enter the name of student  \n");
        name = sc.nextLine() ;
        System.out.println("\n Enter the roll number of student   \n");
        rollNo = sc.nextInt() ;
        Student st = new Student() ;
        st.setName(name) ;
        st.setRollNo(rollNo) ;
        System.out.println("Name of the student is  : " + st.getName() );
        System.out.println("Roll number   of the student is  :  " + st.getRollNo() );

    }
}