class max{
        public static void main(String args[]){
                int []a={1,2,3,4,5,15,6,11,10,7};
                int max=a[0];
                int j=a[0];
                int p=a[0];
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
                a[p]=1;
                max=a[p];
                for(int i=0;i<a.length;i++){
                        if(a[i]>max){
                                max=a[i];
//                                p=i; find 4 max change p=i
                        }
                }
                 System.out.println("third third  "+max);

        }
}
