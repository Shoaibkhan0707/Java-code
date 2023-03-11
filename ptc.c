class demo{
	void merge(int []a,int []b){
	int i=0;
	int j=0;
	int k=0;
	int [][] c=new int[a][b];
	while(i<a.length && b<length){
		if(a[i]<=b[j]){
			c[k++]=a[i++];
		}else{
			c[k++]=b[j++];
		}
	}
	while(i<=length){
		c[k++]=a[i++];
	}
	while(j<=length){
		c[k++]=b[j++];
	}
		for(int i=0;i<length;i++)
		System.out.println(c[i]);
	}
}
class main(){
	int a[]={1,8,2,7,6,5};
	int b[]={11,9,3,4,12,16};
	demo d=new demo();
	merge(a,b);
	}
}
