class myclass{
	public static void main(String args[]){
	StringBuilder sb=new StringBuilder("lucknow");
	System.out.println(sb);
	sb.insert(4,"for");
	System.out.println(sb);
	sb.delete(4,7);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	sb.replace("s","w");
	 System.out.println(sb);
/*	StringBuilder s2=s.append("junction");
	StringBuilder s3=new StringBuilder("jumction");
	System.out.println(s==s2);
	System.out.println(s3==s2);*/
	}
}
