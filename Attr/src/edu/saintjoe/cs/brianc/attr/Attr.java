package edu.saintjoe.cs.brianc.attr;
// These comments are added by Brian
public class Attr {
	
	// Once I create an object and give it a name, it CANNOT be changed!!
	private final String name;
	
	// "value" can be a reference to ANY kind of object!!
	private Object value = null;

	// One-parameter constructor; I know the name, I don't know the value
	public Attr(String name) {
		this.name = name;
	}

	// Two-parameter constructor; I know BOTH the name and the value
	public Attr(String name, Object value) {
		this.name = name;
	    this.value = value;
	    }

	  public String getname() {
	    return name;
	    }

	  public Object getvalue() {
	    return value;
	    }

	  public Object setValue(Object newValue) {
	    Object oldVal = value;
	    value = newValue;
	    return oldVal;
	    }

	  public String toString() {
	    return name + "='" + value + "'";
	    }
	}
