class bubble{
	void bubblesort(int [] a){
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			if(a[i]<a[j]){
			int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
	}
}
class sort{
	public static void main(String args[]){
	int [] ar={9,5,7,43,2,1,75,10,15,11};
	bubble b=new bubble();
	b.bubblesort(ar);
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]+" ");
		}
//		System.out.println();
	}
}
