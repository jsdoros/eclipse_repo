package org.ssglobal.training.codes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestKeyboardInput {

	public static void main(String[] args) {

		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (reader);
		
			System.out.println("Enter keyboard input");
			String message = br.readLine();
			System.out.println(message);
	
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
