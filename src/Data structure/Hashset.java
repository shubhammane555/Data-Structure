package java2;
import java.util.*;
public class Hashset {





public static void main(String []args)
{
HashSet<String>om=new HashSet<String>();
om.add("anand");
om.add("prasad");
om.add("pranchi");
om.add("nityanand");
System.out.println("list is "+om);
HashSet<String>p=new HashSet<String>();
p.add("jacklin");
p.add("katrina");
System.out.println("shhubham chi list"+p);
om.addAll(p);
System.out.println("after adding both list"+om);
System.out.println("total size of list"+om.size());
om.remove("anand");
System.out.println("after removing anand now list is"+om);
om.removeAll(p);
System.out.println("now list is"+om);
System.out.println("now list is empty or not "+om.isEmpty());
//om.clear();
//System.out.println("now list is"+om);
System.out.println("now show the element containg or not "+om.contains("anand"));
om.removeIf(str->str.contains("prasad"));
System.out.println("now list is "+om);
for (String s:om)
{
	System.out.println("now list is "+s);
}




}
}
