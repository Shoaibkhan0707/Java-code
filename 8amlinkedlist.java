class mylinkedlist<E>implements mylist<E>{
	public static node head=null;
	mylinkedlist(){}
	public boolean add(E e){
		node<E>n=new node<E>();
		if(n==null)return false;
		n.data=e;
		n.next=null;
		if(head==null){
			head=n;
		}else{
			node<E>temp=head;
			while(temp.next!=null){
				temp=temp.next;
				}
				temp.next=n;
			}
			return false;
		}
		public void traverse(node<E>head){
			while(head!=null){
				System.out.println(head.data);
				head=head.next;
			}
		}
		boolean  addnode(E e,int pos){
			node<E>temp=new node<E>();
			if(temp==null)return false;
				temp.data=e;
			if(pos==1){
				temp.next=head;
				head=temp;
				return true;
			}
			node<E>t=head;int i=1;
			while((i<pos-1)&&(t!=null)){
				i++;
				t=t.next;
			}
			if(i!=pos-1)return false;
				temp.next=t.next;
				t.next=temp;
				return true;
/*		}
		public void lastnode(node<E>head){
		int p=head;
		while(p.next!=null){
			p=p.next;
			p.next=temp;
		}
		public void randomadd(node<E>head){
			int pos=3,i=1;
			t=head;
			while(i<=pos-1 && t!=null){
				i++;
				t=t.next;
			}
			temp.next=t.next;
			t.next=temp;
		}*/
	}
}
