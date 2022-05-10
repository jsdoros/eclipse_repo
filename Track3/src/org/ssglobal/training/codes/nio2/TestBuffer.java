package org.ssglobal.training.codes.nio2;

import java.nio.ByteBuffer;

public class TestBuffer {

	public static void main(String[] args) {
		
		// Allocation of buffer memory
		ByteBuffer buffer = ByteBuffer.allocate(4025);
		String message = "This is just a buffer transaction";
		writeToBuffer(message, buffer);
		readFromBuffer(buffer);
	}
	
	public static void writeToBuffer(String message, ByteBuffer buffer) {
		
		for(int i = 0; i < message.length(); i++) {
			char temp = message.charAt(i);
			buffer.putChar(temp);
		}
		
	}

	public static void readFromBuffer(ByteBuffer buffer) {
		
		int bufferPos = buffer.position();
		System.out.println(bufferPos);
		
		buffer.flip(); // 1st step - preparing for reading, position pointer sa unahan
		
		// 2nd step
		
		while(buffer.hasRemaining()) {
			System.out.print(buffer.getChar());
		}
	}

}
