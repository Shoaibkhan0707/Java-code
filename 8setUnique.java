import java.util.*;
class udemo{
	public static void main(String args[]){
		HashSet<String>hs=new HashSet<>();
		String []s={"lucknow","kanpur","unnao","kanpur"};
		for(int i=0;i<s.length;i++){
			hs.add(s[i]);
		}
		System.out.println("number of unique elements"+hs.size());
		String[]so=hs.toArray(s);
		for(int i=0;i<so.length;i++){
			System.out.println(so[i]);
		}
	}
}
