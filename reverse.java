import java.util.Scanner;
class reverse{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int x=sc.nextInt();
		int y=0;
		while(x!=0){
			y=y*10+(x%10);
			x=x/10;
		}
		System.out.println(y);
	}
}
