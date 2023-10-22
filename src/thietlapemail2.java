import java.util.*;
import java.io.*;

public class thietlapemail2 {
    private static String chuanhoa(String[] kytu)
    {
        String mail = kytu[kytu.length - 1];
        for(int i = 0;i<kytu.length - 1;i++)
        {
            mail += kytu[i].charAt(0);
        }
        return mail;
    }
    private static String chuanhoaten(String[] kytu)
    {
        String name = "";
        for(String kt : kytu)
        {
            name +=kt +" ";
        }
        return name;
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, Integer> Name = new HashMap<>();
        Map<String, Integer> Mail = new HashMap<>();

        while (sc.hasNext()) {
            String[] words = sc.nextLine().trim().toLowerCase().split("\\s+");
            String ten = chuanhoaten(words);
            String email = chuanhoa(words);

            if (!Name.containsKey(ten)) {
                Name.put(ten, 1);
                int stt = (Mail.containsKey(email) ? Mail.get(email) : 0) + 1;
                Mail.put(email, stt);
                System.out.println(email + (stt > 1 ? stt : "") + "@ptit.edu.vn");
            }
        }
    }
}
