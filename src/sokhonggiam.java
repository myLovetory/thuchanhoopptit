import java.util.*;
import java.io.*;

public class sokhonggiam {
    
    public static boolean check(int n)
    {
        if(n<10) return false;
        String ob = n + "";
        for(int i = 1;i<ob.length();i++)
        {
            if(ob.charAt(i) < ob.charAt(i- 1))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) sc1.readObject();
        int[] a = new int[100000];
        for(Integer i : a1)
        {
            if(check(i))
            {
                a[i]++;
            }
        }
        
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) sc2.readObject();
        int[] b = new int[100000];
        for(Integer i : a2)
        {
            if(check(i))
            {
                b[i]++;
            }
        }
        
        for(int i = 10;i<100000;i++)
        {
            if(a[i] > 0 && b[i] > 0)
            {
                System.out.println(i + " " + a[i] + " " +b[i]);
            }
        }
    }
}
