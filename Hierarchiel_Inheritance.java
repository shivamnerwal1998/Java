package com.company ;

class Leopard{
    public void brave()
    {
        System.out.println(" Leopard is very brave ");
    }
}
class BabyLeopard extends Leopard{
    public void food()
    {
        System.out.println("BabyLeopard loves rabbit ");
    }
}

class SmallBabyLeopard extends Leopard
{
    public void health()
    {
        System.out.println("Small Baby leopard is very helthy ");
    }
}
public class Hierarchiel_Inheritance{
    public static void main(String[]args)
    {
        SmallBabyLeopard rocky = new SmallBabyLeopard() ;
        rocky.health();
        rocky.brave() ;
        BabyLeopard muka = new BabyLeopard() ;
        muka.food() ;
        muka.brave() ;
    }


}