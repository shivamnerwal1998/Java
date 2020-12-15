package com.company ;
import java.util.Scanner ;

public class Method {
    // method to get the elements of array
    static void getData(int []arr , Scanner sc)
    {
        System.out.println("Enter the Marks of students ");
        for(int i = 0 ; i < arr.length ; i++ )
        {
            System.out.printf("\n Enter the marks of %d subject:  \n",  i+1 ) ;
            arr[i] = sc.nextInt() ;
        }

    }
    // method to getAverage
    static float getAverage(int []arr)
    {
        int sum = 0 ;

        for(int i = 0 ; i < arr.length ; i++ )
        {
            sum += arr[1] ;
        }
        float avg = (sum / (arr.length * 100 )) *100;
        return avg ;
    }
    // main method
    public static void main(String[]args){
        System.out.println(" Enter the number of students   ");
        int num ;
        Scanner sc = new Scanner(System.in) ;
        num = sc.nextInt() ;
        int []arr  ;
        arr = new int[num] ;
        getData(arr , sc);
        int avg = getAverage(arr) ;
        System.out.println("the average is :") ;
        System.out.println(avg);


    }

}
