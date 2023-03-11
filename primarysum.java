class myclass1{
	public static void main(String args[]){
	int [][]a={{1,2,3,4},{2,4,6,8},{1,3,5,7},{10,20,30,40}};
	int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(i==j){
				sum+=a[i][j];
			}
		}
	}
		System.out.println(sum);
	}
}
