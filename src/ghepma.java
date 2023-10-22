import java.util.*;
import java.io.*;
public class ghepma {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> a1 = (ArrayList<String>) sc1.readObject();
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) sc2.readObject();
        
        TreeSet<String> st = new TreeSet<>();
        for(String i : a1)
        {
            for(Integer j : a2)
            {
                st.add(i + j.toString());
            }
        }
        for(String i : st)
        {
            System.out.println(i);
        }
    }
}
