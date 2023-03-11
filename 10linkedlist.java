import java.util.*;
class ldemo{
	public static void main(String args[]){
		LinkedList<String>ll=new LinkedList<>();
		ll.add("lucknow");
		ll.add("kanpur");
		ll.add("lulu");
	//	ll.remove("lulu");
		ListIterator<String>itr=ll.listIterator();
		while(itr.hasNext())
			itr.next();
              		while(itr.hasPrevious()){
                      		System.out.println(itr.previous());

//		ll.addFirst("addfirst");
//		ll.offerFirst("offerfisrt");
//		Iterator<String>itr=ll.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
		}
	}
}
