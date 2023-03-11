class demo1{
	int x=10;
	static int y=20;
}
class staticmain{
	public static void main(String args[]){
	demo1 d=new demo1();
	demo1 d2=new demo1();
	System.out.println(d.x+" "+d.y);
	System.out.println(d2.x+" "+d2.y);
	d.x=15;
	d.y=30;
	System.out.println(d.x+" "+d.y);
	System.out.println(d2.x+" "+d2.y);
	}
}

