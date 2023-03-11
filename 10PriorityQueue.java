import java.util.*;
class pdemo{
	public static void main(String args[]){
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("lucknow");
		pq.add("kanpur");
		pq.add("unnao");
		pq.add("jhasi");
		while(pq.size()!=0){
			System.out.println(pq.peek());
			pq.remove();
		}
	}
}
