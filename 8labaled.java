class demo{
	public static void main(String args[]){
	ab:
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if(i==2)break ab;
			System.out.println(i+" "+j);
			}
		}
	}
}
