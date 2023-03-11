class parents{
	int add(int x,int y){
		return x+y;
	}
}
class child extends parents{
	int add(int a,int b){
		return a+b+20;
	}
}
class rmain{
	public static void main(String args[]){
	parents c=new child();
	int k=c.add(10,15);
	System.out.println(k);
	}
}
