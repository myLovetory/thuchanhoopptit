import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class A {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        sc.nextLine();
        BigInteger min = null;
        BigInteger max = null;
        BigInteger sum = BigInteger.ZERO;
        
        for(int i = 0;i<n;i++)
        {
            BigInteger num = new BigInteger(sc.nextLine());
            if(min == null || num.compareTo(min) <0)
            {
                min= num;
            }
            
            if(max == null || num.compareTo(max) > 0)
            {
                max = num;
            }
            sum = sum.add(num);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}
