class staticblock{
	static{
		//int  x=10;
		System.out.println("static block");
	}
	{
		 System.out.println("non static demo");
	}
}
class snsmain{
	public static void main(String args[]){
	staticblock sns= new staticblock();
	staticblock sns2= new staticblock();
	}
}
