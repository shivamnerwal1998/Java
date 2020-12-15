package com.company ;
import java.util.Scanner ;

public class MethodOverLoading{
    static void wish()
    {
        System.out.println("Good morning ");
    }
    static void wish(String name1)
    {
        System.out.println("Good morning " + name1);
    }
    static void wish(String name1 , String name2)
    {
        System.out.println("Good morning"+ name1 +"and " + name2 );
    }
    public static void main(String[] args)
    {
        String name1 , name2  ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the name 1 ");
        name1 = sc.next() ;
        System.out.println("enter the name 2 ");
        name2 = sc.next() ;
        int  choice ;
        System.out.println("press 1 to wish without name ");
        System.out.println("press 2 to wish  " + name1 + "only");
        System.out.println("press 3 to wish " + name1 + "and" + name2 );
        choice = sc.nextInt() ;
        switch (choice)
        {
            case 1 :
                wish() ;
                break ;
            case 2 :
                wish(name1) ;
                break;
            case 3:
                wish(name1 , name2 ) ;
                break ;
            default :
                System.out.println("invalid input");



        }

    }

}
