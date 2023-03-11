interface I1{
	I2 m1();
}
interface I2{
	void m2();
}
class a implements I1{
	public I2 m1(){
	System.out.println("m1 method");
	return new b();
	}
}
class b implements I2{
	public void m2(){
		System.out.println("m2 method");
	}
}
class Factory{
	public static I1 factory(){
	return new a();
	}
}
