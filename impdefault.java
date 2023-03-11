interface myinterface{
	public static final int age=20;
	public abstract void printer();
	public default void show(){
		System.out.println("show method");
	}
	public static void display(){
		System.out.println("display method");
	}
}
class myclass implements myinterface{
	public void printer(){
		System.out.println("printer method");
	}
	public static void display(){
		System.out.println("display of myclass");
	}
}
class demo{
	public static void main(String args[]){
	myclass m=new myclass();
	m.printer();
	m.show();
	m.display();
	myclass.display();
	myinterface.display();
	}
}
