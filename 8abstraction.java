class myclass{
	private myclass(){}
	public void printer(){
		System.out.println("printer mehod");
	}
	public static myclass factory(){
		 return new myclass();
	}
}
class fmain{
	public static void main(String args[]){
	myclass m=myclass.factory();
	m.printer();
	}
}
