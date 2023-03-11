interface myinterface{
	public void printer();
}
class myclass{
	public void show(myinterface mi){
		mi.printer();
	}
}
class Factory{
	public static myclass factory(){
		return new myclass();
	}
}
class idemo implements myinterface{
	public void printer(){
	System.out.println("printer method");
	}
}
class main{
	public static void main(String args[]){
	myclass m=Factory.factory();
//	m.show(new idemo());
	m.show(new myinterface(){
		public void printer(){
		System.out.println("printer");
		}
	});
//	m.printer();
	}
}
