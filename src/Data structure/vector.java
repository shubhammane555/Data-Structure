package java2;
import java.util.*;	
public class vector {


public static void main(String []args)
{
Vector<String>om=new Vector<String>();
om.add("apurva");
om.add("vidula");
om.add("aishu");
System.out.println("list is "+om);
System.out.println("hash code"+om.hashCode());
om.addElement("swara");
System.out.println("new list is "+om);
System.out.println("capacity "+om.capacity());
om.removeElement("vidula");
System.out.println("list is "+om);
om.removeElementAt(1);
System.out.println("list is "+om);
}
}
