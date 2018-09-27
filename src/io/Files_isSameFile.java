package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//-Returns true if two path objects are equal without even checking the file existence.
public class Files_isSameFile {

	public Files_isSameFile() throws IOException {
		
		boolean sameFile = Files.isSameFile(Path.of("d:/aaa/alice30.txt"), Path.of("d:/aaa/alice30.txt"));
		System.out.println("Same file?: " + sameFile);

		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) throws IOException {
		new Files_isSameFile();

	}

}
