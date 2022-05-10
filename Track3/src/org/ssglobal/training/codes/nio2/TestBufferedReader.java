package org.ssglobal.training.codes.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestBufferedReader {

	public static void main(String[] args) {

		Path nioFile = Paths.get("src/config/nio.txt");
		Charset utfCharset = Charset.forName("UTF-8");
		
		// validation
		if(Files.notExists(nioFile)){
			try {
				Files.createDirectory(nioFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(BufferedReader breader = Files.newBufferedReader(nioFile, utfCharset)){
			
			breader.mark(1000); //put number larger tham the read file
			String line = breader.readLine();
			while(line != null) {
				System.out.println(line);
				line = breader.readLine();
			}
			
			breader.reset();
			breader.mark(1000);
			line = breader.readLine();
			while(line != null) {
				System.out.println(line);
				line = breader.readLine();
			}
			
			breader.reset();
			breader.mark(1000);
			breader.lines().forEach((str) ->{
				System.out.println(str);
			});
			
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
