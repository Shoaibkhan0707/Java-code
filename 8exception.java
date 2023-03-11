import java.util.Scanner;
class edemo{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("enter enumerator and denomerator");
	String  data=sc.nextLine();
	String[] nums=data.split(" ");
	int numerator=Integer.parseInt(nums[0]);
	int denominator=Integer.parseInt(nums[1]);
	System.out.println(numerator/denominator);
	}
}
