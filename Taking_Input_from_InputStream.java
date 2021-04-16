
import java.io.* ;
public class Taking_Input_from_InputStream{

    public static void main(String[] args) throws Exception {

        System.out.println("WELCOME ");
        InputStreamReader r = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(r) ;
        String str = br.readLine() ;
        String []S = str.split(" ");
        for(String st : S  )
            System.out.println(Integer.parseInt(st));
        r.close();
        br.close();


    }
}

