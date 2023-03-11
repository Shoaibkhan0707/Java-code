import java.util.Scanner;
class demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		mylist<Integer>list=new mylinkedlist<Integer>();
	/*	for(int i=0;i<10;i++){
		list.add(i);
	}
	list.traverse(mylinkedlist.head);
	}*/
	int option;
	while(true){
		System.out.println(" choice\n 1.node\n 2.treaversenode\n 3.randomadd\n 4.deletenode\n 5.exit\n");
		option=sc.nextInt();
		switch(option){
			case 1:
				for(int i=1;i<10;i++){
                			list.add(i);
        			}
				break;
			case 2:
				list.traverse(mylinkedlist.head);
				break;
			case 3:
				int x;
				System.out.println("enter data to insert\n");
				x=sc.nextInt();
				int y;
				System.out.println("enter pos\n");
				y=sc.nextInt();
				list.addnode(x,y);
				break;
			case 4:
				int z;
				System.out.println("enter pos\n");
                                z=sc.nextInt();
                                list.deletenode(z);
				break;

			case 5:
				System.exit(0);
			default:
				System.out.println("invalid option\n");
		}
	}

}
}
