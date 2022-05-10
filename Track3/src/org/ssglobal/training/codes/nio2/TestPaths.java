package org.ssglobal.training.codes.nio2;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPaths {

	public static void main(String[] args) {
		
		Path path = Paths.get("src/config/nio.txt");
		try {
			Files.createFile(path);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		Path web = Paths.get("src/web");
		try {
			Files.createDirectory(web);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		// Utility
		//File pathToFile = path.toFile(); // convert to old IO, but why wud u???
	
		Path fullPath = path.toAbsolutePath();
		System.out.println(fullPath);
		
		URI pathToURI = path.toUri();
		System.out.println(pathToURI);
	}
}
