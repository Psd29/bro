package practice;

public class Test1 extends Test {
	
	public void fixed() {
		System.out.println("fixed is 9%");

	}
	@Override
	public void Savings() {
		System.out.println("Savings is 11%");
		super.Savings();

	}
	
	public static void main(String[] args) {
		Test1 d = new Test1();
		d.Savings();
		d.fixed();
		d.deposit();
	}
	
	
	
	
	
	
}
