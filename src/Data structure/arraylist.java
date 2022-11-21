package java2;


import java.util.*;

public class arraylist {


public static void main(String []args)
{
ArrayList<String>om=new ArrayList<String>();
om.add("aishu");
om.add("apurva");
om.add("vidula");
System.out.println("omkar chi list"+om);
ArrayList<String>p=new ArrayList<String>();
p.add("swara");
p.add("priyanka");
p.add("dipti");
System.out.println("prasad chi list"+p);
om.addAll(p);
System.out.println("after adding both list"+om);
System.out.println("total size of list"+om.size());
om.remove("swara");
System.out.println("after removing swara now list is"+om);
om.removeAll(p);
System.out.println("now list is"+om);
System.out.println("omkar single ahe ky?"+om.isEmpty());
System.out.println("list madhey vidula ahe ky"+om.contains("vidula"));
System.out.println("omkar chi fav kon? "+om.get(1));
System.out.println("sagale baga"+om);
om.set(1,"swara");
System.out.println("new list"+om );
om.add(1,"apurva");
System.out.println("after patchup now lis is "+om);
//om.clear();
//System.out.println("now list is "+om) ;
//Collections.sort(om);//it is a class

//for ( String s:om)
//{
	//System.out.print(s);
	//}
	
	//Iterator itr=om.iterator();
	//while (itr.hasNext())
	//{
	//System.out.println(itr.next());
	//}
	om.removeIf(str->str.contains("swara"));
	System.out.println("now list is "+om);
	
	}
	}
	