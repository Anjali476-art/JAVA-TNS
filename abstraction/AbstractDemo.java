package abstraction;
public class AbstractDemo {

	public static void main(String[] args) {
		Square sq = new Square(4);
		sq.calArea();
		System.out.println(sq.show());
		
		
		Rectangle r = new Rectangle(2,3);
		r.calArea();
		System.out.println(r.show());
		
		

	}

}