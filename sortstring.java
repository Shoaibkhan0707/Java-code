class sort{
        String stringsort(String s){
	char[]a=s.toCharArray();
        for(int i=0;i<a.length;i++){
                for(int j=1;j<a.length-i;j++){
                        if(a[j-1]>a[j]){
                        	char temp=a[j-1];
                        	a[j-1]=a[j];
                        	a[j]=temp;
				}
                        }
                }
		return new String(a);
        }
}
class main{
	public static void main(String args[]){
	sort s=new sort();
	String k="lucknow";
	String k3=s.stringsort(k);
	System.out.print(k3);
	System.out.println();
	}
}
