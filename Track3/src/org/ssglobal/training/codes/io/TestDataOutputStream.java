package org.ssglobal.training.codes.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {

	public static void main(String[] args) {

		File file = new File("./src/config/accounts.bin");
		int[] accountNums = new int[] { 232323, 89283, 23232, 111232, 34343 };
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			for(int account: accountNums) {
				dos.writeInt(account);
			}
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
