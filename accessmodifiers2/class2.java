package accessmodifiers2;

import accessmodifiers1.*;

public class class2 {
	public static void main(String args[])
	{
		sameClass sc1 = new sameClass();
		
		//default and protected can't Accessable
		
		//System.out.println(sc1.defvari);
		//System.out.println(sc1.protvari);
		
		System.out.println(sc1.pubvari);
	}
}

