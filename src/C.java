
import java.util.*;


/**
 *
 * @author TGDD
 */
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            String s = sc.nextLine();
            String[] tu = s.split(" ");
            StringBuilder tmp = new StringBuilder();
            for(int i = tu.length- 1;i>=0;i--)
            {
                tmp.append(tu[i]).append(" ");
            }
            String res = tmp.toString().trim();
            System.out.println(res);
        }
    }
}
