class mclass{
	void printer(){
		System.out.println("mclass");
	}
}
class factory{
	public static mclass fact(){
		return  new mclass();
	}
}
class mdemo{
	public static void main(String args[]){
		mclass m=factory.fact();
		m.printer();
	}
}
