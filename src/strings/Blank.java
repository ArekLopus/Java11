package strings;

public class Blank {

	public Blank() {
		
		String str1 = "Abc";
		String str2 = "";
		String str3 = " \n\r";
		
		System.out.println("Str1 is blank? -> "+str1.isBlank());
		System.out.println("Str2 is blank? -> "+str2.isBlank());
		System.out.println("Str3 is blank? -> "+str3.isBlank());
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Blank();

	}

}
