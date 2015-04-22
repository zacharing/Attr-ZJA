package edu.saintjoe.cs.brianc.attr;

public class ScreenColor {
	
	// A ScreenColor object has two fields (data members)
	private int colorValue;
	private String description;

	
	public ScreenColor(Object colorDescription) {
		description = (String) colorDescription;
	    colorValue = encode(colorDescription);
	    }
	  
	  private int encode(Object colorDescription) {
		  if (colorDescription.equals("transparent"))
				  return (colorValue = 0x000000);
		  else if (colorDescription.equals("red"))
			  return (colorValue = 0xff0000);
		  return 0;
	  }

	}
