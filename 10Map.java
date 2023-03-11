import java.util.*;
class mdemo{
	public static void main(String args[]){
		Map<Integer,String>m=new HashMap<>();
		m.put(1,"amit");
		m.put(2,"sumit");
		m.put(3,"anil");
	//	System.out.println(m.get(1));
		Set<Integer> s=m.keySet();
		Iterator<Integer>itr=s.iterator();
		s.remove(1);
		String s1=m.get(1);
		System.out.println(s1);
/*		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		Collection<String> c=m.values();
        	Iterator<String>it=c.iterator();
        	while(it.hasNext()){
                	System.out.println(it.next());
                }

	}
}
