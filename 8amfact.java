class sumdemo{
        public int fact(int n){
                if(n==1 || n==0)
                return 1;
                return n*fact(n-1);
        }
}
class fmain{
        public static void main(String args[]){
        sumdemo sd=new sumdemo();
        int k=sd.fact(0);
        System.out.println(k);
        }
}
