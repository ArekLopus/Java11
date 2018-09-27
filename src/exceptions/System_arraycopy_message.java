package exceptions;

//Before 	- java.lang.ArrayStoreException thrown
//Now		- java.lang.ArrayStoreException: arraycopy: type mismatch: can not copy int[] into double[]
public class System_arraycopy_message {

	public System_arraycopy_message() {
		
		System.arraycopy(new int[0],0,new double[0],0,0);
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new System_arraycopy_message();

	}

}
