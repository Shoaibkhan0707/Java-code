class selection{
	void selectionsort(int [] a){
	int minindex;
	for(int i=0;i<a.length;i++){
		minindex=i;
		for(int j=i+1;j<a.length;j++){
			if(a[j]<a[minindex]){
			minindex=j;
			}
			int temp=a[minindex];
			a[minindex]=a[i];
			a[i]=temp;
			}
		}
	}
}
class sortdemo{
        public static void main(String args[]){
        int [] ar={8,5,7,6,3,4,2,1};
        selection s=new selection();
        s.selectionsort(ar);
        for(int i=0;i<ar.length;i++){
                System.out.print(ar[i]+" ");
                }
              System.out.println();
        }
}

