class myclass{
        int x;
        private myclass(){}
        static myclass m=null;
        public void printer(){
                System.out.println("printer mehod");
        }
        public static myclass factory(){
                // return new myclass();
                if(m==null){
                        m=new myclass();
                }
                return m;
        }
}
class fmain{
        public static void main(String args[]){
        myclass m=myclass.factory();
        m.printer();
        m.x=20;
        myclass m2=myclass.factory();
        System.out.println(m.x+" "+m2.x);
        }
}
