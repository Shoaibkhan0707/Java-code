interface myclass{
	 void show();
}
class demo implements myclass{
	 void show(){
		System.out.println("this is interface");
		}
	}
//}
class main{
	public static void main(String args[]){
	demo m=new demo();
	m.show();
	}
}
