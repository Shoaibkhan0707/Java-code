import java.util.*;
class listdemo{
	public static void main(String args[]){
		Collection<String>c=new ArrayList<String>();
		c.add("lucknow");
		c.add("kanpur");
		c.add("bnz");
		 System.out.println(c.size());

//		c.remove("bnz");
		Iterator<String>itr=c.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			itr.remove();
			
		}
		  System.out.println(c.size());
	}
}

