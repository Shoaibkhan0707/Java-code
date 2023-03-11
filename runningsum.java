class sum{
	public static void main(String args[]){
	int []a={5,10,2,8,3,7,9};
	int []b=new int[a.length];
	b[0]=a[0];
	for(int i=1;i<b.length;i++){
		b[i]=a[i]+b[i-1];
		}
	for(int i=0;i<b.length;i++){
		System.out.print(b[i]+" ");
		}
	System.out.println();
	}
}
