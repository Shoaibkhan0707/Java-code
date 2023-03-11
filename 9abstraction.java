class parents{
	void printer(){
		System.out.println("printer of parents");
	}
}
class factory{
	public static parents factory(){
		return new parents();
	//	return new child();
	}
}
class child extends parents{
	void printer(){
                System.out.println("printer of child");
        }
}
class abs{
	public static void main(String args[]){
	parents p=factory.factory();
	p.printer();
	}
}
