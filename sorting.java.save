import java.util.*;
class sort{
	public static void Merge(int ar[],int arr[],int res[],int len1,int len2){
	int i=0;
	int j=0;
	int k=0;
	while (i<len1){
		res[k]=ar[i];
		i++;
		k++;
	}
	while (j<len2){
		res[k]=arr[j];
		j++;
		k++;
	}
	Arrays.sort(res);
}
//class main{
	public static void main(String[] args){
	int a[]={8,5,6,2,1,3};
	int b[]={4,8,3,2,11,9};
	int len1=a.length;
	int len2=b.length;
	int res[]=new int[len1+len2];
	Merge(a,b,res,len1,len2);
	for (int i=0;i<len1+len2;i++){
		System.out.print(res[i]+"  ");
		}
	System.out.println(" ");
	}
}
