import java.util.Scanner;
class fibdemo{
	public long fib(int n){
	if(n==1 || n==2)return 1;
	long a=1;
	long b=1;
	long c=0;
	for(int i=3;i<=n;i++){
		c=a+b;
		a=b;
		b=c;
	}
	return c;
	}
}
/*public long fib(int n){
	if(n==1|| n==2)	
		return n;
	return fib(n-1)+fib(n-2);
	}
}*/
class fdemo{
	public static void main(String args[]){
	fibdemo fb=new fibdemo();
	long  n=10;
	for(int i=1;i<=n;i++){
		System.out.print(fb.fib(i)+" ");
		}
	System.out.println();
	}
}
