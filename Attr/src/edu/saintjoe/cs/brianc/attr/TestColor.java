package edu.saintjoe.cs.brianc.attr;

public class TestColor {
	  public static void main(String[] args) {
		ColorAttr color0 = new ColorAttr("Dumb");
		ColorAttr color1  = new ColorAttr("Green", "Emerald");
		ColorAttr color2 = new ColorAttr("Red", new Integer(0xff0000));

		// Now let's see what we did
		System.out.println("color0 " + color0.toString());
		System.out.println("color1 " + color1.toString());
		System.out.println("color2 " + color2.toString());

		// Make some changes with the setter
		color1.setValue("Chartreuse");
		System.out.println("Changed color1 " + color1.toString());
		System.out.println("color2 " + color2.toString());
		color2.setValue(new Integer(15));
		System.out.println("Changed color2 " + color2.toString());
		}
	}
