class myclass{
	private myclass(){}
	static myclass m=null;
	public static myclass singledemo(){
		if(m==null){
			return new myclass();
		}else{
			return m;
		}
	}
	void printer(){
		System.out.println("hello majnu");
	}
}
class demo{
	public static void main(String args[]){
	myclass m=myclass.singledemo();
	m.printer();
	}
}
