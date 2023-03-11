import java.io.*;
class fdemo{
	public static void main(String args[]){
		String hd=System.getProperty("user.home");
		String path=hd+File.separator+"jdir"+File.separator+"abc.text";
		File f=new File(path);
		try{
			f.createNewFile();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());


	}
}
