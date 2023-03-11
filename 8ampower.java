class sumdemo{
        public int power(int x,int n){
                if(n==1)
                return x;
                return x*power(x,n-1);
        }
}
class pmain{
        public static void main(String args[]){
        sumdemo sd=new sumdemo();
        int k=sd.power(2,5);
        System.out.println(k);
        }
}
