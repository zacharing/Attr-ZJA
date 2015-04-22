package edu.saintjoe.cs.brianc.attr;

public class ScreenColor {
	
	// A ScreenColor object has to properties (data members)
	private int colorValue;
	private String description;

	  public ScreenColor(Object colorDescription) {
	    description = (String) colorDescription;
	    colorValue = encode(colorDescription);
	    }
	  
	  private int encode(Object colorDescription) {
		  if (colorDescription.equals("transparent"))
				  return (colorValue = 0x0000000);
		  else if (colorDescription.equals("red"))
			  return (colorValue = 0x1231232);
		  return 0;
	  }

	}
