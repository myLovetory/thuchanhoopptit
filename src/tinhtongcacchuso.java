import java.util.*;


public class tinhtongcacchuso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            String str = sc.next();
            int tong = 0;
            //sapxepchucai tong chu so de cuoi
            List<Character> s = new ArrayList<>();
            for(int i = 0 ;i < str.length();i++)
            {
                if(Character.isDigit(str.charAt(i)))
                {
                    tong += str.charAt(i) - '0';
                }else{
                    //ko phai so thi in vao list ky tu
                    s.add(str.charAt(i));
                }
            }
            Collections.sort(s);
            for(Character i : s)
            {
                System.out.print(i);
            }
            System.out.println(tong);
        }
    }
}
