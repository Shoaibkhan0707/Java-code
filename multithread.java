import java.io.*;
class threaddemo{
	public static void main(String args[]){
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
	}
}
