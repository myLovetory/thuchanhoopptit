import java.util.*;
import java.io.*;


/**
 *
 * @author TGDD
 */

class monthi implements Comparable<monthi>
{
    public String mamon,tenmon,hinhthuc;
    
    public monthi(String mamon, String tenmon, String hinhthuc)
    {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.hinhthuc = hinhthuc;
    }

    public String getMa()
    {
        return mamon;
    }
    @Override
    public String toString()
    {
        return mamon + " " + tenmon + " " + hinhthuc;
    }
    @Override
    public int compareTo(monthi a)
    {
        return this.mamon.compareTo(a.getMa());
    }
}
public class danhsachmonthi2 {
    public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<monthi> ls = new ArrayList<>();
        Set<String> SID = new HashSet<>();
        while(sc.hasNext())
        {
            monthi mt = new monthi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(!SID.contains(mt.mamon))
            {
                SID.add(mt.mamon);
                ls.add(mt);
            }
        }
        Collections.sort(ls);
        for(monthi i : ls)
        {
            System.out.println(i);
        }
         
    }
}


