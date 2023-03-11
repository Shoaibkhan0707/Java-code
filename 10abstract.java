abstract class myclass{
	myclass(){
		System.out.println("constructor of myclass");
        }
	abstract int add(int x,int y);
	void printer(){
		System.out.println("printer method");
	}
}
class child extends myclass{
	child(){
		System.out.println("constructor of child");
        }
	int add(int x,int y){
		return x+y;
	}
}
/*abstract class Aclass{
 	void show(){
                System.out.println("show method");
        }
}*/
class abs{
	public static void main(String args[]){
	myclass m=new child();
	m.printer();
	System.out.println(m.add(2,5));
//	Aclass a=new Aclass();
	}
}

