package org.ssglobal.training.codes.nio2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestBufferedWriter {

	public static void main(String[] args) {
		
		Path nioFile = Paths.get("src/config/nio.txt");
		
		// Charset
		Charset utfCharset = Charset.forName("UTF-8");
		
		if(Files.notExists(nioFile)){
			try {
				Files.createDirectory(nioFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		String message1 = "The first line for nio.txt\n";
		String message2 = "The second line for nio.txt\n";
		try(BufferedWriter bwriter = Files.newBufferedWriter(nioFile,
				StandardOpenOption.CREATE, StandardOpenOption.APPEND)){ //utfCharset-previous 2nd param (over-write)
			bwriter.append(message1, 0, message1.length());
			bwriter.append(message2, 0, message2.length());
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
