class sdemo{
	public static void main(String args[]){
	String s1="lucknow";
	String s2=new String("lucknow");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	String s4="lucknow";
	System.out.println(s1.equalsIgnoreCase(s4));
	System.out.println(s1.equals(s4));
	System.out.println(s1.indexOf('n'));
	String s5="lucknow junction";
	System.out.println(s5.indexOf('n'));
	System.out.println(s5.lastIndexOf('n'));
	System.out.println(s1.charAt(2));
	String city="kanpur";
	String c1=city.substring(0,4);
	System.out.println(c1);
	String c2=city.substring(3,6);
        System.out.println(c2);
	String c3=city.substring(3);
	System.out.println(c3);
	String stations="lucknow-kanpur-unnao";
	String[]sa=stations.split("-");
	for(int i=0;i<sa.length;i++){
		System.out.println(sa[i]);
		}
	}
}
