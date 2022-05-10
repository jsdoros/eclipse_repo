package org.ssglobal.training.codes.nio2;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestMemoryMappedBuffer {

	public static void main(String[] args) {

		String message = "This is a memory-mapped transaction. \n";
		Path nioFile = Paths.get("src/config/nio.txt");
		
		if(Files.notExists(nioFile)){
			try {
				Files.createDirectory(nioFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileChannel channel = FileChannel.open(nioFile, StandardOpenOption.CREATE,
					StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING,
					StandardOpenOption.READ);
			writeMemoryMapped(message, channel);
			readMemoryMapped(channel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeMemoryMapped(String message, FileChannel channel) {
		
		try {
			MappedByteBuffer mapBuffer = channel.map(MapMode.READ_WRITE, 0, message.length());
			for(int i = 0; i < message.length(); i++) {
				mapBuffer.put((byte)message.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readMemoryMapped(FileChannel channel) {
		
		try {
			MappedByteBuffer mapBuffer = channel.map(MapMode.READ_ONLY, 0, channel.size());
			for(int i = 0; i < mapBuffer.limit(); i++) {
				System.out.print((char)mapBuffer.get());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
