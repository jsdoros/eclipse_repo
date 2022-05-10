package org.ssglobal.training.codes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyScanner {

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);
		
	public String nextLine() {
		
		String message = null;
		
		try {
			message = br.readLine();
			message = message.split("")[0];
		} catch (IOException e) {
			e.printStackTrace();
		}
		return message;
	}
	
	public String nextInt() {
		
		String message = null;
		int msg = 0;
		
		try {
			message = br.readLine();
			msg = Integer.parseInt(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void close() {
		
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
