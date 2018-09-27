package boolean_parse;

//It has become a little faster after remove the redundant null check.
public class Boolean_parseBoolean {

	public Boolean_parseBoolean() {
		
		boolean parseBoolean = Boolean_parseBoolean.parseBoolean("abc");
		System.out.println(parseBoolean);
		
		System.out.println("\n--- Main Thread Finished ---");
	}
	
	//Before
	public static boolean parseBooleanOld(String s) {
        return ((s != null) && s.equalsIgnoreCase("true"));
    }
	
	//Now
	public static boolean parseBoolean(String s) {
        return "true".equalsIgnoreCase(s);
    }
	
	
	public static void main(String[] args) {
		new Boolean_parseBoolean();

	}

}
