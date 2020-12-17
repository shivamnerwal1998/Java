package com.company;
import java.util.Scanner ;

class Cylinder{
    private float height ;
    private float radius ;
    Cylinder(float radius ,float height)
    {
        this.height = height ;
        this.radius = radius ;

    }
    void getData()
    {
        System.out.println("Radius of cylinder is " + this.radius );
        System.out.println("Height of cylinder is " + this.height );
    }
    float getArea()
    {
        float area  = (2*3.14f*this.radius*height);
        return area ;

    }
    float getVolume()
    {
        float volume = (3.14f * this.radius * this.radius * this.height) ;
        return volume ;
    }
}
public class Constructor_Practice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        float height  ;
        float radius ;
        System.out.println("\n Enter the Hight  \n");
        height = sc.nextFloat() ;
        System.out.println("\n Enter the Radius   \n");
        radius = sc.nextFloat() ;
        Cylinder obj1 = new Cylinder(height , radius ) ;
        obj1.getData() ;
        System.out.println("Area of cylinder :  " + obj1.getArea());
        System.out.println("Avolume of Cylinder : " + obj1.getVolume());

    }
}
