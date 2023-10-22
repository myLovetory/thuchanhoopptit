
/**
 *
 * @author TGDD
 */
import java.util.*;
public class chusonguyento {
    public static int n;
    //luu cau hih
    public static int[] a = {2,3,5,7};
    public static  ArrayList<Long> kqua = new ArrayList<>();
    
    public static boolean check(String s)
    {
        //neu so cuoi = 2 
        if(s.charAt(s.length() - 1) == '2')
        {
            return false;
        }
        //xet dkien
        Set<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        
        //tra ve neu du 4 chu so 
        return set.size() == 4;
        
    }
    public static void Try(String s)
    {
        if(s.length() > n)
        {
            return;
        }
        if(s.length() >=4 && check(s))
        {
            kqua.add(Long.parseLong(s));
        }
        //xetcauhinhke
        for(int i : a)
        {
            Try(s + Integer.toString(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Try("");
        Collections.sort(kqua);
        for(Long i : kqua)
        {
            System.out.println(i);
        }
    }
}
