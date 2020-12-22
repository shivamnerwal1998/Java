import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s2 ;  
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                if( x <  100   )
                {
                    
                    String s  = String.valueOf(x) ;
                
                    s2 =   "0" ;  
                    while( true ){
                        
                        s2 = (s2+s) ; 
                        if( s2.length() >= 3 )
                            break ;     
                    }
                    
                }
                else{
                     s2 = String.valueOf(x) ;
                }
                 
                System.out.format("%-15s%s\n",s1,s2) ;
            }
            System.out.println("================================");

    }
}



