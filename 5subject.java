import java.util.Scanner;
class marks{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int sub1=sc.nextInt();
	int sub2=sc.nextInt();
	int sub3=sc.nextInt();
	int sub4=sc.nextInt();
	int sub5=sc.nextInt();
	int total=sub1+sub2+sub3+sub4+sub5;
	int percentage=total/5;
	if(percentage>=90)
		System.out.println("grade A");
	else if(percentage>=80)
                System.out.println("grade b");
        
	else if(percentage>=70)
                System.out.println("grade c");
        
	else if(percentage>=60)
                System.out.println("grade d");

	else if(percentage>=60)
                System.out.println("grade e");

        else
                System.out.println("grade fail");
	System.out.println("total"+" "+total);
	System.out.println("percentage"+" "+percentage);
	}
}


