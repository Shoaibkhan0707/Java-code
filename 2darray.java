class array{
	public static void main(String args[]){
	int [][]a=new int[4][4];
	int count=1;
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			a[i][j]=count++;
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
}
