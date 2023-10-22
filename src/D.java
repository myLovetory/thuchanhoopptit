
/**
 *
 * @author TGDD
 */
import java.util.*;
import java.io.*;

public class D {
    static public boolean check(String x)
    {
       
        if(x.length() < 2)
        {
            return false;
        }
        else{
            for(int i = 0;i<x.length() - 1;i++)
            {
                if(Integer.parseInt(x.charAt(i) + "") < Integer.parseInt(x.charAt(i + 1) + ""))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> vt1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> vt2 = (ArrayList<Integer>) sc2.readObject();
        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        TreeMap<Integer,Integer> map2 = new TreeMap<>();
        for(int i : vt1)
        {
            if(check(i +""))
            {
                
                if(map1.containsKey(i))
                {
                    int dem = map1.get(i) + 1;
                    map1.put(i, dem);
                }else{
                    map1.put(i,1);
                }
            }
        }
        
       
        
        for(int i : vt2)
        {
            if(check(i +""))
            {
                if(map2.containsKey(i))
                {
                    int dem = map2.get(i) + 1;
                    map2.put(i, dem);
                }else{
                    map2.put(i,1);
                }
            }
        }
        
        for(Map.Entry<Integer, Integer> et : map1.entrySet())
        {
            Integer K = et.getKey();
            Integer V = et.getValue();
            if(map2.containsKey(K))
            {
                System.out.println(K + " " + V + " " + map2.get(K));
                System.out.println();
            }
        }
    }
    
}
