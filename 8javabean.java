class mybean{
	private int age;
	private String name;
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
                return this.age;
        }
	public void setName(String name){
                this.name=name;
        }
	public String getName(){
                return this.name;
        }
}
class beanmain{
	public static void main(String args[]){
	mybean m=new mybean();
	m.setAge(20);
	m.setName("shoaib");
	System.out.println(m.getAge());
	System.out.println(m.getName());

	}
}
