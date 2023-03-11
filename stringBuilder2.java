class myclass{
	public static void main(String args[]){
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.ensureCapacity(40);
		System.out.println(sb.capacity());
/*		sb.replace(4,7,"later");
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/

		}
}
