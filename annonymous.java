//interface myinterface{
class myinterface{
	void printer(){
	System.out.println("myinterface");
	}
}
class mainclass{
	public static void main(String args[]){
	myinterface m=new myinterface(){
//	public void printer(){
//		System.out.println("printer method");
//		}
	};
	m.printer();
	}
}
