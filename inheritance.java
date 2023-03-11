class parents{
	void show(){
		System.out.println("show of parents");
	}
	void display(){
		 System.out.println("parents display");
        }

}
class child extends parents{
        void printer(){
                System.out.println("child printer");
        }
	void show(){
                System.out.println("child of show");
        }
}
class idemo{
	public static void main(String args[]){
	parents c=new child();
	c.show();
	c.display();
//	c.printer();
	}
}
