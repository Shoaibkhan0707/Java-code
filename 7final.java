class myclass{
	final static int k=15;
	int x;
	final int y;
	myclass(int a,int b){
		x=a;
		y=b;
	}
}
class fmain{
	public static void main(String args[]){
	myclass m=new myclass(10,20);
//	m.k=150;
	m.x=25;
	System.out.println(myclass.k);
	System.out.println(m.x);
	System.out.println(m.y);
	}
}
