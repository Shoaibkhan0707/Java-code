import java.util.*;
class edemo{
        public static void main(String args[]){
                Map<Integer,String>m=new HashMap<>();
                m.put(1,"amit");
                m.put(2,"sumit");
                m.put(3,"anil");
                System.out.println(m.get(2));
		Set<Map.Entry<Integer,String>> me = m.entrySet();
		Iterator<Map.Entry<Integer,String>>itr=me.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer,String>me1=itr.next();
			System.out.println(me1.getKey());
			System.out.println(me1.getValue());
		}
	}
}

