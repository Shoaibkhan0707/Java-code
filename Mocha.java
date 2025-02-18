public class Mocha extends CondimentDecorator{
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return this.beverage.getDescription()+"Mocha";
	}
	public double cost(){
		return 0.20+beverage.cost();
	}
}
