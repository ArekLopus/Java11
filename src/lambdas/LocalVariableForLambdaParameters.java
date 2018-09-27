package lambdas;

//-Why add var support? The answer is for one special case, which is when you want to add an annotation to the Lambda parameter.
// It is not possible to do this without a type being involved.
// To avoid having to use the explicit type, we can use var to simplify things.

public class LocalVariableForLambdaParameters {

	public LocalVariableForLambdaParameters() {
		
		//list.stream()
	    //  .map((@Notnull var s) -> s.toLowerCase())
	    //  .collect(Collectors.toList());
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new LocalVariableForLambdaParameters();

	}

}
