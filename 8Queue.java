import java.util.*;
class qdemo{
	public static void main(String args[]){
	Deque<Integer>d=new ArrayDeque<>();
	d.add(1);
	d.add(2);
	d.addLast(50);
	d.add(3);
	d.addFirst(10);
	Iterator<Integer>itr=d.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}
}
