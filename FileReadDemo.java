import java.io.*;
class filedemo{
	public static void main(String args[]){
	String hdir=System.getProperty("user.home");
	String sep=File.separator;
	String path=hdir+sep+"Desktop";//"java"//+sep+"abc.text";
	File f=new File(path,"car.jpg");
	File f1=new File(path,"bbc.jpg");
	try(FileInputStream fis =new FileInputStream(f)){
		FileOutputStream fos=new FileOutputStream(f1);
		int data;
		while((data=fis.read())!=-1){
		//	System.out.println("done");
			//System.out.print((char)data);
			fos.write(data);
		}
		System.out.println("done");
		fis.close();
		fos.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
//		fis.close();
	}
}
