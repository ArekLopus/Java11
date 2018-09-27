package gc;

//http://openjdk.java.net/jeps/333
//-Z Garbage Collector, also known as ZGC, is a scalable low-latency garbage collector.
// GC pause times should not exceed 10ms
// Handle heaps ranging from relatively small (a few hundreds of megabytes) to very large (many terabytes) in size
// No more than 15% application throughput reduction compared to using G1
// Lay a foundation for future GC features and optimizations leveraging colored pointers and load barriers
// Initially supported platform: Linux/x64
public class ZGC_experimental {

	public ZGC_experimental() {
	
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new ZGC_experimental();

	}

}
