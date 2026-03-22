package abstraction;
public class Rectangle extends Shape{
	int height;
	int width;
	
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}


	@Override
	int calArea() {
		return area = height*width;	
	}
	
}