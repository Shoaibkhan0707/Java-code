import java.util.*;
class hdemo{
	public static void main(String args[]){
		Hashtable<String,Integer>ht=new  Hashtable<>();
		ht.put("lucknow",300);
		ht.put("unnao",200);
		ht.put("allahabad",250);
		ht.put("unnao",150);
		Integer up=ht.get("unnao");
		System.out.println(up);
		Enumeration<String>ek=ht.keys();
		Enumeration<Integer>ev =ht.elements();
        	while(ek.hasMoreElements()){
                	System.out.println(ek.nextElement());
                }
		System.out.println();
		while(ev.hasMoreElements()){
                        System.out.println(ev.nextElement());
                }
		System.out.println();
         }
}

