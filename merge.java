class merge{
        public static void main(String args[]){
                int []a={1,2,3,4,5};
                int []b={6,7,8,9,10};
                int length1=a.length;
                int length2=b.length;
                int c1=length1+length2;
                int []c=new int[c1];
                int k=0;
                for(int i=0;i<a.length;i++){
                        c[k]=a[i];
                        k++;
                }
                for(int j=0;j<b.length;j++){
                        c[k]=b[j];
                        k++;
                }
                for(int i=0;i<a.length+b.length;i++){
                        System.out.print(c[i]+" ");
                }
        }
}

