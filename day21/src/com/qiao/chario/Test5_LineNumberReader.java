package com.qiao.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Test5_LineNumberReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("xxx.txt"));
		
		String line;
		lnr.setLineNumber(100);				//�����к�
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);//��ȡ�к�
		}
		lnr.close();
	}

}
