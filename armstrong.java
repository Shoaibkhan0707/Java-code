class arms{
	public static void main(String args[]){
		int num=153;
        	int rem,temp,sum=0;
        	temp=num;
        	while(num!=0){
            		rem=num%10;
			System.out.println("rem"+" "+rem);
            		sum=sum+(rem*rem*rem);
			System.out.println("sum"+" "+sum);
            		num=num/10;
			System.out.println("num"+" "+num);

        	}
        	if(temp==sum)
			System.out.println("armstrong nunber"+" "+temp);
		else
			System.out.println("not armstrong number"+temp);
		}
}
