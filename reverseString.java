class reverse{
	public static void main(String args[]){
		String s="abcd";
		char[]a=s.toCharArray();
		for(int i=0;i<a.length/2;i++){
		int j=a.length-i-1;
		char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println(a);
	}
}
