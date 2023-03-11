import java.util.*;
import java.io.*;
class filedemo{
        public static void main(String args[]){
        String hdir=System.getProperty("user.home");
        String sep=File.separator;
	String path=hdir+sep+"java";
	File f=new File(path,"abc.text");
	try(FileOutputStream fos=new FileOutputStream(f)){
	Scanner sc=new Scanner(System.in);
	String ch;
	int data;
//		while(!(ch=sc.next()).equals("#")){
		while((data=fos.read())!=-1){
			//fis.write(data);
		System.out.print((char)data);
		}
		fos.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	//	System.out.print();
	}
}
