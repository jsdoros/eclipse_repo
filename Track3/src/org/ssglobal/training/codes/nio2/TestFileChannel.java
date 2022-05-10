package org.ssglobal.training.codes.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestFileChannel {

	public static void main(String[] args) {
		
		String message = "This is just a buffer transaction \n";
		String message2 = "This is with channel \n";
		ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
		ByteBuffer buffer2 = ByteBuffer.wrap(message2.getBytes());
		Path nioFile = Paths.get("src/config/nio.txt");
		
		if(Files.notExists(nioFile)){
			try {
				Files.createDirectory(nioFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(FileChannel channel = FileChannel.open(nioFile, StandardOpenOption.CREATE,
				StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING,
				StandardOpenOption.READ);) {
			
			writeWithChannel(buffer, buffer2, channel);
			readWithChannel(channel);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static void writeWithChannel(ByteBuffer buffer, ByteBuffer buffer2, FileChannel channel){
		
		try  {
			channel.position(0);
			channel.write(buffer);
			channel.write(buffer2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readWithChannel(FileChannel channel){
		
		try {
			ByteBuffer temp = ByteBuffer.allocate(5042);
			Charset utfCharset = Charset.forName("UTF-8");
			channel.position(0);
			while(channel.read(temp) >= 0) {
				temp.flip();
				String message = utfCharset.decode(temp).toString();
				System.out.println(message);
				temp.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
