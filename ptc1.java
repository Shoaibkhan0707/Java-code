class sort{
	public void bubble(int []a){
	for(int i=0;i<a.length;i++){
		for(int j=1;j<a.length-i;j++){
			if(a[j-1]>a[j]){
			int temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
				}
			}
		}
	}
}
class bmain{
	public static void main(String args[]){
	int[]ar={8,5,7,4,2,9,11,1};
	sort s=new sort();
	s.bubble(ar);
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]+" ");
		}
	}
}
