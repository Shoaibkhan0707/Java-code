class Mythread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class demo1{
        public static void main(String args[]){
       // 	Mythread r=new Mythread();
       //         Thread t1=new Thread(r);
       //         Thread t2=new Thread(r);
		Thread t1=new Mythread();
                Thread t2=new Mythread();
		t1.setName("fthread");
		t2.setName("sThread");
		t1.setPriority(5);
		t2.setPriority(10);
                t1.start();	
                t2.start();
        }
}
