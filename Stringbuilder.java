class myclass{
	public static void main(String args[]){
	StringBuilder s=new StringBuilder();
	s.append("lucknow");
	System.out.println(s.length()+" "+s.capacity());

	s.append(" junction");
	System.out.println(s.length()+" "+s.capacity());

	s.append(" east");
//	StringBuilder s2=new StringBuilder("lucknow");
	System.out.println(s.length()+" "+s.capacity());
//	System.out.println(s2.length()+" "+s2.capacity());
	}
}
