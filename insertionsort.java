class insertion{
	void insertionsort(int [] a){
	for(int i=0;i<a.length;i++){
		int temp=a[i];
		int j=i-1;
		while(j>=0 && temp<=a[j]){
			a[j+1]=a[j];
			j=j-1;
			}
		a[j+1]=temp;
		}
	}
}
class idemo{
        public static void main(String args[]){
        int [] ar={9,5,7,43,2,1,75,10,15,11};
        insertion s=new insertion();
        s.insertionsort(ar);
        for(int i=0;i<ar.length;i++){
                System.out.print(ar[i]+" ");
		}
              	System.out.println("\n");
        }
}
