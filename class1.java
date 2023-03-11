class seconddemo{
	int age;
	public void printer(int x){
	System.out.println(x);
}
public static void main(String args[]){
	System.out.println("hello,kmc");
	seconddemo sd = new seconddemo();
	sd.age=20;
	seconddemo sd2 = new seconddemo();
	sd.printer(sd.age);
	sd.printer(sd2.age);
	}
}
