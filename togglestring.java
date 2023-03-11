class Myclass{
	String toggle(String s){
	char[]ca=s.toCharArray();
	for(int i=0;i<ca.length;i++){
		if(ca[i]>=65 && ca[i]<=97){
			ca[i]=(char)(ca[i]+32);
			}
		else if(ca[i]>=97 && ca[i]<=122){
			ca[i]=(char)(ca[i]-32);
			}
		}
	//	String s2=new String(ca);
		return new String(ca);
	}
}
class Main{
	public static void main(String args[]){
	Myclass m=new Myclass();
	String k="LuCknow JUNction";
	System.out.println(k);
	String s3=m.toggle(k);
//	m.toggle(k);
	System.out.println(s3);
	}
}
