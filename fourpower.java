class four{
	public static void main(String args []){
	int x=27;
	int count=0;
	while(x!=0){
		count++;
		x=(x)&(x-1);
		}
	System.out.println(count);
	}
}
/*	int x=64;
	int temp=1; // power of  four
	while(temp<=x){
	if(temp==x){
		System.out.println("true");
		System.out.println(temp);
	}
		temp=temp<<2;
		}
	}
}*/
