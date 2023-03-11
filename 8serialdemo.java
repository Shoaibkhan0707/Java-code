import java.io.*;
class sdemo{
	public static void main(String args[]){
		try{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("bbb.dat"));
			myclass m=new myclass();
			m.x=20;
			m.y=40;
			oos.writeObject(m);
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("bbb.dat"));
			myclass m2=(myclass)ois.readObject();
			System.out.println(m2.x);
			System.out.println(m2.y);
			}catch(Exception e){
				e.printStackTrace();
		}
	}
}
