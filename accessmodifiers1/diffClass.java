package accessmodifiers1;

public class diffClass {
	public static void main(String args[])
	{
		sameClass sc = new sameClass();
		sc.defaultmethod();
		sc.privatemethod();
		sc.protmethod();
		sc.publicmethod();
		
		//private member can't accessible
		//System.out.println(sc.privari);
		
		System.out.println(sc.defvari);
		System.out.println(sc.protvari);
		System.out.println(sc.pubvari);
		
	}
	
}
