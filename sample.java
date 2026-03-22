class samp{
	int a=10;
	String s = "Java";
	public void show()
	{
		System.out.println("The String value is: "+s);
	}
}
public class sample {

	public static void main(String[] args) {
		samp obj = new samp();
		System.out.println(obj.a);
		obj.show();

	}

}