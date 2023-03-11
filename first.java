import java.util.Scanner;
class myclass{
	public static void main(String args[]){
	Scanner input =new Scanner(System.in);
	System.out.println("enter the first marks");
	int s1=input.nextInt();
	System.out.println("enter the second marks");
        int s2=input.nextInt();
	System.out.println("enter the third marks");
        int s3=input.nextInt();
	System.out.println("enter the fourth marks");
        int s4=input.nextInt();
	System.out.println("enter the five marks");
        int s5=input.nextInt();
	int total=s1+s2+s3+s4+s5;
	int percentage=total*5/100;
	System.out.println(total);
	System.out.println(total);
	}
}

