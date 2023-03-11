class parents{
	 void printer(){
		System.out.println("parents");
	}
}
class child extends parents{
	 void show(){
                System.out.println("child");
		super.printer();
        }
}
class pmain{
	public static void main(String [] aggs){
	child c=new child();
	c.show();
	}
}
