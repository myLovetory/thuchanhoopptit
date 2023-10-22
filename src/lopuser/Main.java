package lopuser;

/**
 *
 * @author TGDD
 */
import java.util.*;
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        
        LinkedHashMap<User, Integer> map = new LinkedHashMap<>();
        ArrayList<User> a = new ArrayList<>();
        
        for(int i = 0;i < t; i++)
        {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            User us = new User(tmp[0] ,tmp[1]);
            a.add(us);
            map.put(us, 0);
        }
        
        t = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < t ;i++)
        {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            for(User us : a)
            {
                if(us.getUserName().equals(tmp[0]))
                {
                    if(us.getPassWord().equals(tmp[1]))
                    {
                        map.replace(us,map.get(us) + 1);
                    }
                }
            }
        }
        for(Map.Entry<User,Integer> et : map.entrySet())
        {
            System.out.print(et.getValue() + " ");
        }
        System.out.println();
    }
    
}
