class StarBuck{
	public static void main(String args[]){
		Beverage b=new Expresso();
		System.out.println(b.getDescription());
		System.out.println(b.cost());
		Mocha m=new Mocha(b);
		Mocha m2=new Mocha(new HouseBlend());
		System.out.println(m.getDescription());
		System.out.println(m.cost());
		System.out.println(m2.getDescription());
		System.out.println(m2.cost());
	}
}
