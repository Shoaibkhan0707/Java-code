import java.io.*;
class myclass{
	int x=10;
}
class mainclass{
	public static void main(String args[]){
	myclass m=new myclass();
	System.out.println(m instanceof myclass);
	}
}
