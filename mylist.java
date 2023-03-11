public interface mylist<E>{
	boolean add(E e);
	void traverse(node<E>head);
	boolean addnode(E e,int pos);
	boolean deletenode(int pos);
}
