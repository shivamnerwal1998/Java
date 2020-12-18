package com.company;

class Animal{

    public void hungary()
    {
        System.out.println("HEy IaM FeElInG HuNgAry");
    }
}
class Dog extends Animal {

    public void habit()
    {
        System.out.println("Hello I am a faithful Dog ") ;
    }

}
class Puppy extends Dog{
    public void weep(){
        System.out.println("Hello I am A little pupppy , i weeps when i feel alone ") ;
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args)
    {
        Puppy tommy = new Puppy() ;
        tommy.hungary() ;
        tommy.habit() ;
        tommy.weep() ;
    }

}
