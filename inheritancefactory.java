class myclass{
	void show(){
		System.out.println("show myclass");
	}
}
class factory{
	public static myclass factory(){
		return new child();
	}
}
class child extends myclass{
	 void show(){
                System.out.println("show child");
        }
}
class main{
	public static void main(String args[]){
	myclass m=factory.factory();
	m.show();
	}
}
