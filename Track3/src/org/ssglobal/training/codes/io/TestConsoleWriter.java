package org.ssglobal.training.codes.io;

import java.io.PrintWriter;

public class TestConsoleWriter {

	public static void main(String[] args) {

		PrintWriter consoleWriter = new PrintWriter(System.out);
		consoleWriter.println("This is a console writer!");
		
		consoleWriter.flush();
		consoleWriter.close();

	}

}
