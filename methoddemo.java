class methoddemo{
	public int add(int x,int y){
		return x+y;
	}
	void printer(int x,int y){
		System.out.println(add(x,y));
	}
	static void display(int x,int y,methoddemo m){
		System.out.println(m.add(x,y));
	}
public static void main(String args[]){
	methoddemo md=new methoddemo();
	md.printer(10,20);
	display(10,20,md);
	}
}
