package io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

//For testing where the contents don't matter.
//You can think of them like /dev/null for throwing away an output you don’t need or providing an input that always returns zero bytes.
@SuppressWarnings("unused")
public class NullReaderWriterAndStreams {

	public NullReaderWriterAndStreams() {
		
		Reader nullReader = Reader.nullReader();
		Writer nullWriter = Writer.nullWriter();
		InputStream nullInputStream = InputStream.nullInputStream();
		OutputStream nullOutputStream = OutputStream.nullOutputStream();
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new NullReaderWriterAndStreams();

	}

}
