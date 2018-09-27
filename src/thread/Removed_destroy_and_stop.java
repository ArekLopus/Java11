package thread;

//	destroy()  and  stop(Throwable obj)  of Thread class are removed in JDK 11.
//-Since JDK 8, the destroy() method has never done anything except throwing the  NoSuchMethodError.
// The stop(Throwable) method hasn't done anything except throwing the  UnsupportedOperationException.
public class Removed_destroy_and_stop {

	public Removed_destroy_and_stop() {
	
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Removed_destroy_and_stop();

	}

}
