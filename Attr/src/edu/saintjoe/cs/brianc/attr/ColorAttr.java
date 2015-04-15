package edu.saintjoe.cs.brianc.attr;

	public class ColorAttr extends Attr {
		  private ScreenColor myColor; // The decoded color

		  public ColorAttr(String name, Object value) {
		    super(name, value);
		    System.out.println("C1");
		    decodeColor();
		    }

		  public ColorAttr(String name) {
		    this(name, "Transparent");
		    System.out.println("C2");
		    }

		  public ColorAttr(String name, ScreenColor value) {
		    super(name, value.toString());
		    System.out.println("C3");
		    myColor = value;
		    }

		  public Object setValue(Object newValue)  {
			    // do superclass stuff first
			    Object retval = super.setValue(newValue);
			    decodeColor();
			    return retval;
			    }

		  /** Set value to ScreenColor, not description */
		  public ScreenColor setValue(ScreenColor newValue) {
			    // do superclass first
			    super.setValue(newValue.toString());
			    ScreenColor oldValue = myColor;
			    myColor = newValue;
			    return oldValue;
			    }

		  /** Return decoded ScreenColor object */
		  public ScreenColor getValue() {
			    return myColor;
			    }

			  /** Set ScreenColor from description */
			  protected void decodeColor() {
			    if(getValue() == null)
			        myColor = null;
			    else
			      myColor = new ScreenColor(getvalue());
			    }
			}

