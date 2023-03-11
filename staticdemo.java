class staticdemo{
	int age=10;
	static int salary=20;
	public void printer(){
		System.out.println(age);
		System.out.println(age);
		staticdemo sd=new staticdemo();
		System.out.println(sd.age);
		System.out.println(sd.salary);
		System.out.println(staticdemo.salary);
	}
}
class staticmain{
public static void main(String args[]){
//	System.out.println(salary);
	 System.out.println(staticdemo.salary);
//	 System.out.println(age); non static ko main mein call krne ke liye referrences ki jarurat hota hai;
	 staticdemo s=new staticdemo();
         System.out.println(s.age); // call with references :
         System.out.println(s.salary);
	s.printer();
	}
}


