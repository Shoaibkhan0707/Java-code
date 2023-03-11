class parents{
	parents(int x){
		 System.out.println("constructor of parents");
		}
        void show(){
                System.out.println("show of parents");
        }
        void display(){
                 System.out.println("parents display");
        }

}
class child extends parents{
		child(){
			super(5); // rigth
			 System.out.println("constructor of childs");
			//	super(5); wrong
			}
        void printer(){
                System.out.println("child printer");
        }
        void show(){
                System.out.println("child of show");
        }
}
class idemo{
        public static void main(String args[]){
        child c=new child();
        c.show();
        c.display();
//      c.printer();
        }
}

