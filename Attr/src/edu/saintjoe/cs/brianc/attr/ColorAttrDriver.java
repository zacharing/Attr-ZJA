package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testOne, testTwo, testThree, testFive, testSix;
		Attr testFour;
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		// Number one
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		// toString in this case is different than in Number four because
		// this toString only goes to ColorAttr while Number four goes back
		// to the original Attr class
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());
	
		// Number four
		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
		testFive = new ColorAttr("ColorFive", "charteuse");
		System.out.println(testFive.toString());
		
		testSix = new ColorAttr("ColorSix", "crimson");
		System.out.println(testSix.toString());
		
		
	} // end main
}