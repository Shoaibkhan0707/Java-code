class max{
	public static void main(String args[]){
		int []a={1,8,2,30,7,6,50,4};
		int max=a[0],j=0,p=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
				j=i;
			}
		}
		System.out.println("first max "+max);
		a[j]=1;
		max=a[j];
		 for(int i=0;i<a.length;i++){
                        if(a[i]>max){
                                max=a[i];
                                p=i;
                        }
                }
                System.out.println("second max "+max);
		a[p]=2;
                max=a[p];
                 for(int i=0;i<a.length;i++){
                        if(a[i]>max){
                                max=a[i];
                        }
                }
                System.out.println("third max "+max);
	}
}
