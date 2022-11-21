package java2;


import java.util.*;

class linkedlist
{
public static void main(String []args)
{
LinkedList<String>om=new LinkedList<String>();
om.add("apurva");
om.add("vidula");
System.out.println("omkar chi list"+om);
om.addFirst("swara");
System.out.println("after adding swara"+om);
om.addLast("aishu");
System.out.println("after adding aishu"+om);
System.out.println("fist element in list"+om.getFirst());
System.out.println("last element in list"+om.getLast());
LinkedList<String>p=new LinkedList<String>();
p.add("jacklin");
p.add("katrina");
System.out.println("shhubham chi list"+p);
om.addAll(p);
System.out.println("after adding both list"+om);
System.out.println("total size of list"+om.size());
om.remove("aishu");
System.out.println("after removing aishu now list is"+om);
om.removeAll(p);
System.out.println("now list is"+om);
System.out.println("now list is empty or not "+om.isEmpty());
//om.clear();
//System.out.println("now list is"+om);
System.out.println("now show the element containg or not "+om.contains("apurva"));
om.set(1,"baby"); ////it override
System.out.println("now list is"+om);
om.removeIf(str->str.contains("swara"));
System.out.println("now list is "+om);
	Collections.sort(om);
	System.out.println("now list is "+om);
	for ( String s:om)
{
	System.out.println(s);
}
	Iterator itr=om.iterator();
	while (itr.hasNext())
	{
	System.out.println(itr.next());
	}
	om.removeFirst();
	System.out.println("now list is "+om);
	om.removeLast();
	System.out.println("now list is "+om);
}
}

