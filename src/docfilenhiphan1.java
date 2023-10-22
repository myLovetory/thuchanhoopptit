import java.util.*;
import java.io.*;

public class docfilenhiphan1 {
    public static boolean prime(int n)
    {
        if(n<2) return false;
        for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(n % i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException,FileNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        TreeSet<Integer> s = new TreeSet<>();
        for(Integer i : a)
        {
            String res = i.toString();
            if(res.length() > 2 && prime(i))
            {
                s.add(i);
            }
        }
        
        for(Integer i : s)
        {
            System.out.println(i);
        }
        
    }
}
