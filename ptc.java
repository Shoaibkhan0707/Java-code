class parents{
	void demo(){
		System.out.println("parents");
	}
}
class child extends parents{
	void demo2(){
		System.out.println("child");
	}
}
class main{
	public static void main(String args[]){
		child c=new child();
		c.demo();
		c.demo2();
	}
}
