import java.util.*;
class sdemo{
        public static void main(String args[]){
                Set<String>hs=new TreeSet<>();
                hs.add("lucknow");
                hs.add("kanpur");
                hs.add("unnao");
                hs.add("kanpur");
                System.out.println(hs.size());
                Iterator<String>itr=hs.iterator();
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
        }
}


