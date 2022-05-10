package org.ssglobal.training.codes.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class TestStreamTokenizer {

	public static void main(String[] args) {
		
		int[] sum = new int[4];	// 4 fruits
		double[] avg = new double[4];
		String fruit = "";
		int counter = 0;
		int currIndex = -1;
		
		try {
			FileReader fr = new FileReader("./src/config/mines.txt");	// create mines.txt first
			StreamTokenizer tokenizer = new StreamTokenizer(fr);
			
			int tokenType = tokenizer.nextToken();
			
			while (!(tokenType == StreamTokenizer.TT_EOF)) {	// Token Type End Of File
				if (tokenType == StreamTokenizer.TT_NUMBER) {
					
					switch (fruit) {
					case "apple":	// index 0
						sum[0] += (int) tokenizer.nval;
						counter++;
						currIndex = 0;
						break;
					case "lemon":	// index 1
						sum[1] += (int) tokenizer.nval;
						counter++;
						currIndex = 1;
						break;
					case "banana":	// index 2
						sum[2] += (int) tokenizer.nval;
						counter++;
						currIndex = 2;
						break;
					case "avocado":	// index 3
						sum[3] += (int) tokenizer.nval;
						counter++;
						currIndex = 3;
						break;
					}
					
				} else if (tokenType == StreamTokenizer.TT_WORD) {
					fruit = tokenizer.sval.toLowerCase();
					if (currIndex > -1) {
						avg[currIndex] = sum[currIndex] / counter;
						counter = 0;
					}
				}	
				
				tokenType = tokenizer.nextToken();
			}
			avg[currIndex] = sum[currIndex] / counter; 
			
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int sumPerFruit : sum) {
			System.out.println(sumPerFruit);
		}
		
		for (double avgPerFruit : avg) {
			System.out.println(avgPerFruit);
		}

	}

}