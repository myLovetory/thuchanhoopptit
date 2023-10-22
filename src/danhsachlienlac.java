import java.io.*;
import java.util.*;

class SinhVien implements Comparable<SinhVien>
{
    private  String id,name,lop,email,sdt;
    
    public SinhVien(String id,String name,String lop,String email,String sdt)
    {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
        
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + lop + " " + email + " " + sdt;
    }
    
    @Override
    public int compareTo(SinhVien o)
    {
        if(this.lop.equals(o.lop))
        {
            return this.id.compareTo(o.id);
        }else{
            return this.lop.compareTo(o.lop);
        }
    }
}
public class danhsachlienlac {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(sc.hasNext())
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            sv.add(new SinhVien(id, name, lop, email, sdt));
        }
        Collections.sort(sv);
        for(SinhVien i : sv)
        {
            System.out.println(i);
        }
    }
}
