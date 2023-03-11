interface Myinterface{
	int age=10;
	void printer();
}
class myclass implements Myinterface{
	public void printer(){
	System.out.println("printer method");
	}
	void show(){
		System.out.println("show method");
	}
}
class main{
	public static void main(String args[]){
	myclass m=new myclass();
	m.printer();
	m.show();
	System.out.println(Myinterface.age);
	System.out.println(myclass.age);
//	Myinterface.age=50;
	}
}
