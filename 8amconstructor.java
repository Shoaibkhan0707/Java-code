class constructordemo{
	int i;
	String s;
	float f;
/*	{
	i=500; // non static :
	f=5.7f;
	}*/
	constructordemo(int a){
	i=a;
	}
	constructordemo(){
	i=10;
	f=2.3f;
	}
	constructordemo(int a,String b,float c){
	i=a;
	s=b;
	f=c;
	}
}
class demomain{
	public static void main(String args []){
	constructordemo cd =new constructordemo(10,"khan",45.1f);
	System.out.println(cd.i+" "+cd.s+" "+cd.f);
	}
}
