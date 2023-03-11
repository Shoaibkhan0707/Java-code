import java.util.*;
class bdemo{
        public static void main(String args[]){
                LinkedList<String>ll=new LinkedList<>();
                ll.add("lucknow");
                ll.add("kanpur");
                ll.add("barabanki");
                ListIterator<String>itr=ll.listIterator();
		ListIterator<String>itr2=ll.listIterator();
		itr.next();
		itr.next();
		itr.remove();
//		while(itr.hasPrevious())itr.previous();
		while(itr2.hasNext()){
                     // System.out.println(itr2.next());
			while(itr.hasPrevious())itr.previous();
				System.out.println(itr2.next());

	//	itr.add("unnao");
//		Iterator<String>itr1=ll.iterator();
//                while(itr1.hasNext()){
//                	System.out.println(itr1.next());
		}
	}
}
