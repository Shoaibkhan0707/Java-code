class bitdemo{
	public static void main(String args[]){
	byte x=(byte)11;
	byte y=(byte)12;
	int z=(byte)(x&y);
	System.out.println(z);
	int a=(byte)(x|y);
	System.out.println(a);
	int b=(byte)(x^y);
	System.out.println(b);
	}
}
