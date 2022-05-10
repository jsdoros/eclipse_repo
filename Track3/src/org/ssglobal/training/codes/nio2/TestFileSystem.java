package org.ssglobal.training.codes.nio2;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class TestFileSystem {

	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault();
		for(FileStore drive: fs.getFileStores()) {
			System.out.println("--------------------------------");
			System.out.println(drive.name());
			System.out.println(drive.type());
			try {
				System.out.println(drive.getTotalSpace());
				System.out.println(drive.getUnallocatedSpace());
				System.out.println(drive.getUsableSpace());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for(Path p: fs.getRootDirectories()) {
			System.out.println(p.getFileName());
			System.out.println(p.getParent());
			System.out.println(p.getRoot());
			System.out.println(p.getNameCount());
		}
	}

}
