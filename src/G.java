
/**
 *
 * @author TGDD
 */
import java.util.*;

public class G {
    public static long quyluat(int[] a)
    {
        long dem = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i =0;i<a.length;i++)
        {
            while(!st.empty() && a[i] > st.peek())
            {
                int j = st.pop();
                dem += i - j;
            }
            if(!st.empty())
            {
                dem ++;
            }
            st.push(a[i]);
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        long kqua = quyluat(a);
        System.out.println(kqua);
     }
}
