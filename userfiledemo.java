import java.util.*;
import java.io.*;
class fdemo{
        public static void main(String args[]){
        String hdir=System.getProperty("user.home");
        String sep=File.separator;
        String path=hdir+sep+"java";
        File f=new File(path,"abc.text");
	DataInputStream sc = new DataInputStream(System.in);
	System.out.println("write anything here\n");
	char ch;
	try(FileOutputStream fr =new FileOutputStream(f)){
		while((ch=(char)sc.read())!='#'){
			fr.write(ch);
		}
		fr.close();
	}catch(Exception ex){
		ex.printStackTrace();
		}
	}
}
