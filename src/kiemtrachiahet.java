import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class kiemtrachiahet {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = Integer.parseInt(sc.nextLine());
        BigInteger siuu = new BigInteger("7");
        BigInteger saoo = new BigInteger("13");
        
        while(t-- >0)
        {
            BigInteger n = new BigInteger(sc.next());
            if(n.mod(siuu).toString().equals("0") && n.mod(saoo).toString().equals("0"))
            {
                System.out.println("Both");
            }
            else if(n.mod(siuu).toString().equals("0"))
            {
                System.out.println("Div 7");
            }
            else if(n.mod(saoo).toString().equals("0"))
            {
                System.out.println("Div 13");
            }
            else{
                System.out.println("None");
            }
        }
    }
}
