package reversefilecontent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class solution {
	
	public static void main(String[] args) {
		System.out.println("testing reversefilecontent");
						
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			File file = new File("input.txt");
			inputStream = new FileInputStream(file);
			String data = reverseContent(readFromInputStream(inputStream));
			
			File fileoutput = new File("output.txt");
			outputStream = new FileOutputStream(fileoutput);
			outputStream.write(data.getBytes());
			outputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static String readFromInputStream(InputStream inputStream) {
			
		StringBuilder resultStringBuilder = new StringBuilder();
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			String line;
	        while ((line = br.readLine()) != null) {
	            resultStringBuilder.append(line).append("\n");
	        }
		} catch (Exception e) {
			
		}
		
		return resultStringBuilder.toString();
	}
	
	public static String reverseContent(String str) {
		
		int strLength = str.length();
		
		int start = 0;
		int end = strLength - 1;
		
		char[] wholeContent = str.toCharArray();
		
		while(start < end) {
			
			char tempChar = wholeContent[start];
			wholeContent[start] = wholeContent[end];
			wholeContent[end] = tempChar;
			
			start++;
			end--;
		}
		
		return new String(wholeContent);
	}

}
