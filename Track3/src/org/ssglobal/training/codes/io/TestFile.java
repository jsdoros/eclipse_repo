package org.ssglobal.training.codes.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		// Eclipse project / Java project --> root folder
		File filePoem = new File("./src/config/poem.txt"); // Java path; Python uses absolute
		
		//File filePoem = new File("." + File.separator+ "src" + File.separator + "config" + File.separator + "poem" + File.separator + ".txt");
		
		System.out.println(filePoem.hashCode());
		
		try {
			boolean isCreated = filePoem.createNewFile();
			System.out.println(isCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File dirPages = new File("./src/pages");
		boolean isDirCreated = dirPages.mkdir();
		System.out.println(isDirCreated);
		
		File dirNetwork = new File("./src/config/network/socket");
		boolean isDirNetworkCreated = dirNetwork.mkdirs();
		System.out.println(isDirNetworkCreated);
		
		// Utilities
		
		// Getters
		try {
			System.out.println(filePoem.getCanonicalPath()); // pag walang permission, papasok sa catch, walang makikita
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(filePoem.getAbsolutePath()); // pag walang permission, may makikita pa
		System.out.println(filePoem.getPath());
		System.out.println(dirPages.getPath());
		
		Path poemPath = filePoem.toPath(); // to be continued soon in NIO (concurrent IO)!
		
		System.out.println(filePoem.length()); // length is a number of characters the file contains
		System.out.println(filePoem.getFreeSpace());
		System.out.println(filePoem.getParent());
		
		File dirConfig = new File("./src/config"); // creating a pointer is not necessarily to create, but to access
		for (String lookup: dirConfig.list()) {	// will get laman
			System.out.println(lookup); // list is applicable to a directory
		}
		
		for(File look: dirConfig.listFiles()) {
			System.out.println(look.getAbsolutePath());
		}
		
		System.out.println(new Date(filePoem.lastModified())); // file is long type
		
		// Setters
		filePoem.setExecutable(true);
		//filePoem.renameTo(new File("./src/config/tula.txt")); // renames poem.txt
		filePoem.deleteOnExit(); // need i-close yung eclipse/refresh para magfalse yung exists()
		filePoem.delete(); // force deletion
		
		// Validators
		System.out.println(dirNetwork.isDirectory());
		System.out.println(dirNetwork.isFile());
		System.out.println(filePoem.exists()); // indicator if delete() or deleteOnExit() was used
	}

}
