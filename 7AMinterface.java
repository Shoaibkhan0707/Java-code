interface demo{
        public void show();
//              System.out.println("demo");

}
interface good{
        public void show1();
}
class demo1 implements demo,good{
        public void show(){
                System.out.println("demo1");
        }
        public void show1(){
                System.out.println("show function");
        }
}
class maindemo{
        public static void main(String args[]){
                demo1 d=new demo1();
                d.show();
                d.show1();
        }
}





