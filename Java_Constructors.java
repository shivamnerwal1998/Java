package com.company;

class Person
{
    private String contactNo ;
    private String name ;

    // default constructor
    public Person()
    {
        name = "Shivam" ;
        contactNo = "9258727071" ;
    }
    // parametrised constructor
    public Person(String name)
    {
        this.name = name   ;
    }
    // constructor overLoading
    public Person(String name , String contactNo )
    {
        this.name = name ;
        this.contactNo = contactNo ;
    }

    String getName()
    {
        return this.name ;
    }
    String getContact()
    {
        return this.contactNo ;
    }

}
public class Java_Constructors {
    public static void main(String[] args)
    {

        Person obj = new Person() ;
        System.out.println("the name of student1 is : " + obj.getName() );
        Person obj2 = new Person("Anupam") ;
        System.out.println("the name of student2 is : " + obj2.getName() );
        Person obj3 = new Person("Amit" , "5978526648") ;
        System.out.println("the name of student3 is : " + obj3.getName());
        System.out.println("the contact of student3 is : " + obj3.getContact());



    }
}
