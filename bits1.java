class demo{
    public static void main(String args[]){
        int count=0,b=15;
        for(int i=0;i<10;i++){
        if((b&1)==1)
        count++;
                b=(byte)(b>>1);
        }
        System.out.println(count);       
    }
}

