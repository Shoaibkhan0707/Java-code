import java.util.*;
class vdemo{
	public static void main(String args[]){
	Vector<Integer>v=new Vector<>();
	v.add(30);
	v.add(20);
	v.add(23);
	Iterator<Integer>itr=v.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println();

	Enumeration<Integer>en =v.elements();
	while(en.hasMoreElements()){
		System.out.println(en.nextElement());
		}
	System.out.println();

	for(int i:v){
		 System.out.println(i);
		}
	}
}
