class bubble{
	void sort(int []a){
		int index;
		for(int i=0;i<a.length;i++){
			index=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[index]){
				index=j;
				}
			}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
	}
}
class sort{
	public static void main(String args[]){
		int ar[]={8,5,7,6,3,4,2,1};
		bubble b=new bubble();
		b.sort(ar);
		for(int i=0;i<ar.length;i++){
			System.out.print(" "+ar[i]);
		}
		System.out.println();
	}
}
