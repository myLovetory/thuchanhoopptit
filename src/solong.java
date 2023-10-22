import java.util.*;
import java.io.*;

public class solong {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        //do de bai  vượt quá kiểu dữ liệu int nhưng vẫn trong giới hạn kiểu long
        long tong = 0;
        while(sc.hasNext())
        {
            String inp = sc.next();
            try {
                int a = Integer.parseInt(inp);
            } catch (NumberFormatException catch1) {
                try {
                    long b = Long.parseLong(inp);
                    tong += b;
                } catch (NumberFormatException catch2) {
                    
                }
            }
        }
        System.out.println(tong);
        
    }
}
