import java.io.*;
class rdemo{
	public static void main(String args[])throws IOException{
	FileInputStream fis=new FileInputStream("delhi.txt");
	int c;
	while((c=fis.read())!=-1)
		System.out.print((char)c);
		fis.close();
	System.out.println();
}
}
