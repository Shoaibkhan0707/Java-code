class rdemo{
	public static void main(String args []){
	int x=123456;
	int y=0;
	int count=0;
	while(x!=0){
		y=y*10+(x%10);
		x=x/10;
		count++;
	}
	System.out.println(y);
	System.out.println(count);
	}
}
