package io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Files_read_writeString {

	public Files_read_writeString() throws IOException {
		
		String readString = Files.readString(Path.of("d:/aaa/alice30.txt"), Charset.forName("utf-8"));
		//String readString = Files.readString(Path.of("d:/aaa/alice30.txt"));
		System.out.println(readString);
		
		//Files.writeString(Path.of("d:/aaa/alice30copy.txt"), readString);
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) throws IOException {
		new Files_read_writeString();

	}

}
