class bitcount{
	public static void main(String args []){
        int x=32;
        int count=0;
        while(x!=0){
                count++;
                x=(x)&(x-1);
                }
        System.out.println(count);
        }
}
