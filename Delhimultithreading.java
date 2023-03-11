class mythread extends Thread{
	public void run(){
		for(int i=1;i<2000;i++){
			System.out.println(i);
		}
	}
}
class demo{
	public static void main(String args[]){
		mythread m=new mythread(); // single thread
		mythread m2=new mythread(); // multit hread
		Thread t=new Thread(m);
		Thread t2=new Thread(m2);
		t.start();
		t2.start();
	}
}
