
import java.util.*;
public class tangdangiamdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            
            for(int i = 0 ;i < n; i++)
            {
                int so = sc.nextInt();
                if(so % 2==0 && !even.contains(so))
                {
                    even.add(so);
                }
                else if(so % 2 ==1 && !odd.contains(so))
                {
                    odd.add(so);
                }
            }
            
            Collections.sort(even);
            Collections.sort(odd,Collections.reverseOrder());
            
            for(int i : even)
            {
                System.out.print(i +" ");
            }
            System.out.println();
            for(int i : odd)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
