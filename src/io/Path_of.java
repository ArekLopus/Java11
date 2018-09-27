package io;

import java.io.IOException;
import java.nio.file.Path;

public class Path_of {

	public Path_of() throws IOException {
		
		Path path1 = Path.of("d:/aaa/alice30.txt");
		System.out.println(path1);
		
		Path path2 = Path.of("..", "temp");
		System.out.println(path2);
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) throws IOException {
		new Path_of();

	}

}
