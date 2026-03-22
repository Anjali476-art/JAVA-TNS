package Polymorphism;

public class OverloadDemo {

	public static void main(String[] args) {
		overload od = new overload();
		od.addition(10);
		od.addition(24.3f, 20000, true);
		od.addition(20, 30);
	}

}
