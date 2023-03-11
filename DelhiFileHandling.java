import java.io.*;
class demo{
	public static void main(String args[])throws IOException{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("delhi.txt");
		char c;
		while((c=(char)dis.read())!='#')
			fout.write(c);
			fout.close();
	}
}
