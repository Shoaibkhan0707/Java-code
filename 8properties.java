import java.io.*;
import java.util.*;
class pdemo{
	public static void main(String args[]){
		Properties prop=new Properties();
		File f =new File("test.txt");
		try{
			FileInputStream fis= new FileInputStream(f);
			prop.load(fis);
			String name=prop.get("name").toString();
			String city=prop.get("city").toString();
			System.out.println(name);
			System.out.println(city);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
