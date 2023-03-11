class sumdemo{
	public int sum(int n){
		if(n==1)
		return 1;
		return n+xsum(n-1);
	}
}
class main{
	public static void main(String args[]){
	sumdemo sd=new sumdemo();
	int k=sd.sum(5);
	System.out.println(k);
	}
}
