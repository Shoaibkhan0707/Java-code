import java.util.*;
class mapdemo{
        public static void main(String args[]){
                Map<String,String> m = new HashMap<String,String>();
		m.put("name","shoaib");
		m.put("city","lucknow");
		m.put("age","20");
		Set<String> s= m.keySet();
		Iterator<String>itr=s.iterator();
		while(itr.hasNext()){
			System.out.println(m.get(itr.next()));
		}
	}
}
