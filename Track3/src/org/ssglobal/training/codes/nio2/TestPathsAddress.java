package org.ssglobal.training.codes.nio2;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPathsAddress { // since may txt file na, access na lang ito

	public static void main(String[] args) {
		defineAbsolutePath();
		defineRelativePath();
		defineWindowsPath();
	}
	
	public static void defineAbsolutePath() {
		
		Path absolutePath1 = Paths.get("C:Training/Track3/src/config/nio.txt");
		Path absolutePath2 = Paths.get("C:", "Training", "Track3", "src", "config", "nio.text");
		Path absolutePath3 = Paths.get("C:Training", "Track3/src/config/nio.txt");
	
		System.out.println(absolutePath1.toString());
		System.out.println(absolutePath2.toString());
		System.out.println(absolutePath3.toString());
	}
	
	public static void defineRelativePath() {
		
		FileSystem fs = FileSystems.getDefault();
		Path relativePath1 = fs.getPath("Track3/src/config/nio.txt");
		Path relativePath2 = fs.getPath("Track3", "src", "config", "nio.txt");
		Path relativePath3 = fs.getPath("Track3", "src/config/nio.txt");
		
		System.out.println(relativePath1.toString());
		System.out.println(relativePath2.toString());
		System.out.println(relativePath3.toString());
	}
	
	public static void defineSourcePath() {
		Path srcPath1 = Paths.get("src/config/nio.txt");
		Path srcPath2 = Paths.get("src", "config", "nio.txt");
		
		System.out.println(srcPath1.toString());
		System.out.println(srcPath2.toString());
	}
	
	public static void defineWindowsPath() {
		
		FileSystem fs = FileSystems.getDefault();
		Path txtFile = fs.getPath(System.getProperty("user.home"), "mydocuments", "NIO2.txt");
		
		System.out.println(txtFile.toString());
	}

}
