package launcher_for_one_file;

//	JEP 330 eliminates the need to compile a single-file application
//-The Java launcher will identify that the file contains Java source code and will compile the code to a class file before executing it.
//-Parameters placed after the name of the source file are passed as parameters when executing the application.
//-Parameters placed before the name of the source file are passed as parameters to the Java launcher after the code has been compiled.
// This allows for things like the classpath to be set on the command line.
// Parameters that are relevant to the compiler (such as the classpath) will also be passed to javac for compilation.

//For example:
//	java -classpath /home/foo/java Hello.java Bonjour
//would be equivalent to:
//	javac -classpath /home/foo/java Hello.java
//	java -classpath /home/foo/java Hello Bonjour

//This JEP also provides ‘shebang’ support. To reduce the need to even mention the Java launcher on the command line,
//this can be included on the first line of the source file. For example:
//	#!/usr/bin/java --source 11
//	public class HelloWorld {   ...   }

public class Test {			//java Test.java 
	
	public Test() {
		
		System.out.println("freeMemory "+Runtime.getRuntime().freeMemory());
		System.out.println("max "+Runtime.getRuntime().maxMemory());
		System.out.println("total "+Runtime.getRuntime().totalMemory());
		
	}
	
	public static void main(String... args) {
		new Test();
	}
}
