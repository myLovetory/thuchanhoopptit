
/**
 *
 * @author TGDD
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class E {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> set = new HashSet<>();
        List<String> kitu = new ArrayList<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext())
        {
            String kt = sc.next();
            if(kt.matches(".*\\d+.*") && !kt.matches(".*[.!?:,].*"))
            {
                set.add(kt);
            }
        }
        kitu.addAll(set);
        Collections.sort(kitu);
        for(String i : kitu)
        {
            System.out.println(i);
        }
    }
}
