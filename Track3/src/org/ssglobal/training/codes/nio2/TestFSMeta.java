package org.ssglobal.training.codes.nio2;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class TestFSMeta {

	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault();
		
		// Views supported by the FileSystem
		for(String metadata: fs.supportedFileAttributeViews()) {
			System.out.println(metadata); // dos - windows; posix - linux, mac
		}
		
		//Per FileStore views
		for(FileStore store: fs.getFileStores()) {
			System.out.format("--------------------- %s --------------------\n", store.name());
			System.out.format("View: %s; supported: %s \n", BasicFileAttributeView.class.getSimpleName(),
					store.supportsFileAttributeView(BasicFileAttributeView.class)); // reflection API; need to put ".class"
		}
		
		for(FileStore store: fs.getFileStores()) {
			System.out.format("--------------------- %s --------------------\n", store.name());
			System.out.format("View: %s; supported: %s \n", DosFileAttributeView.class.getSimpleName(),
					store.supportsFileAttributeView(DosFileAttributeView.class)); // reflection API; need to put ".class"
		}
		
		for(FileStore store: fs.getFileStores()) {
			System.out.format("--------------------- %s --------------------\n", store.name());
			System.out.format("View: %s; supported: %s \n", PosixFileAttributeView.class.getSimpleName(),
					store.supportsFileAttributeView(PosixFileAttributeView.class)); // reflection API; need to put ".class"
		}
		
		for(FileStore store: fs.getFileStores()) {
			System.out.format("--------------------- %s --------------------\n", store.name());
			System.out.format("View: %s; supported: %s \n", AclFileAttributeView.class.getSimpleName(),
					store.supportsFileAttributeView(AclFileAttributeView.class)); // reflection API; need to put ".class"
		}
		
		for(FileStore store: fs.getFileStores()) {
			System.out.format("--------------------- %s --------------------\n", store.name());
			System.out.format("View: %s; supported: %s \n", FileOwnerAttributeView.class.getSimpleName(),
					store.supportsFileAttributeView(FileOwnerAttributeView.class)); // reflection API; need to put ".class"
		}
		
		for(FileStore store: fs.getFileStores()) {
			System.out.format("--------------------- %s --------------------\n", store.name());
			System.out.format("View: %s; supported: %s \n", UserDefinedFileAttributeView.class.getSimpleName(),
					store.supportsFileAttributeView(UserDefinedFileAttributeView.class)); // reflection API; need to put ".class"
		}

	}

}
