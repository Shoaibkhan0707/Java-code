import java.util.*;
class sdemo{
        public static void main(String args[]){
	Vector<Integer> v=new Vector<Integer>(15);
	System.out.println(v.capacity());
	System.out.println(v.size());
	for(int i=0;i<=20;i++){
		v.add(i*i);
	}

	System.out.println(v.capacity());
        System.out.println(v.size());

	for(int i=0;i<=15;i++){
                System.out.print(v.get(i)+" ");
        }
	 System.out.println(v instanceof RandomAccess);
         System.out.println(v.size());

	}
}
