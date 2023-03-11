import java.util.*;
class fdemo{
	static void m(String s2){
		HashMap<Character,Integer>mp=new HashMap<>();
		char[]c=s2.toCharArray();
		for(char s:c){
			if(s==' ')continue;
			if(mp.containsKey(s)){
				mp.put(s,mp.get(s)+1);
			}else{
				mp.put(s,1);
			}
		}
		for(Map.Entry entry:mp.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public static void main(String args[]){
		String str="lucknow junction";
		m(str);
	}
}
