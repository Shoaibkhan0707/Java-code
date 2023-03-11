package mpkg;
import mypkg.*;
public class mclass1{
	public static void main(String args[]){
//		myclass1 m=new myclass1();
		try{
			Class cl=Class.forName("mypkg.myclass1");
//			myclass1 m2=(myclass1)cl.newInstance();
//			m2.printer();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
