import java.io.*;
import java.util.*;
class imagedemo{
	public static void main(String args[]){
		byte[] b=new byte[1024];
		String hdir=System.getProperty("user.home");
        	String sep=File.separator;
        	String path=hdir+sep+"Desktop";
		File f1=new File(path,"car.jpg");
		File f2=new File(path,"car2.jpg");
		int data;
		try{
			FileInputStream fis=new FileInputStream(f1);
			FileOutputStream fos=new FileOutputStream(f2);
			BufferedInputStream bis=new BufferedInputStream(fis,1024);
			BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
			while((data=bis.read(b,0,1024))!=-1){
				bos.write(b,0,1024);
			}
			bis.close();
			bos.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
