class parent{
	int age;
	String name;
	parent(int age){
	this.age=age;
	}
	parent(int age,String name){
	this(age);
	this.name=name;
	}
}
class pmain{
	public static void main(String args[]){
	parent p=new parent(15);
	System.out.println(p.age);
	System.out.println(p.name);
	parent p2=new parent(20,"raj");
        System.out.println(p2.age);
        System.out.println(p2.name);
        }
}

