package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testColor;
		ColorAttr colorTwo;
		ScreenColor newColor = new ScreenColor("green");
		
		testColor = new ColorAttr("Color","red");
		System.out.println(testColor.toString());
		colorTwo = new ColorAttr("green", newColor);
		
	
	
}
}