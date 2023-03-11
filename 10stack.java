import java.util.*;
class sdemo{
	public static void main(String args[]){
		Stack<String> st=new Stack<String>();
		st.push("lucknow");
		st.push("shahed path");
		st.push("lulu");
//		st.peek("lucknow");
		while(!st.empty()){
			System.out.println(st.pop());
		}
	}
}
