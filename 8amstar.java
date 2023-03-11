class star{
	public static void main(String args[]){
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
	//	if(i>=j)// space allow:
	//	if(i<=j)// space not allow:
	//	if(j>=6-i) space not allowed:
		if(j>=6-i) // give space print pyramid:
			System.out.print("* ");
		else
			System.out.print(" ");
			}
		System.out.println();
		}
	}
}
