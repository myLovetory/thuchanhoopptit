
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class tachdoivatinhtong {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() == 1)
            System.out.println(s);
        while (s.length() > 1)
        {
            BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger b = new BigInteger(s.substring(s.length()/ 2));
            s = a.add(b).toString();
            System.out.println(s);
        }
    }  
        
}