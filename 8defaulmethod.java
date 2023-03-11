interface dmethod{
	void printer(int x);
	default void show(String s){
		System.out.println(s);
	}
}
class ddemo implements dmethod{
	public void printer(int x){
	System.out.println(x);
	}
}
class main{
	public static void main(String args[]){
	ddemo d=new ddemo();
	d.printer(25);
	d.show("lucknow");//default method
//	dmethod.show("lucknow"); static  method
	}
}
