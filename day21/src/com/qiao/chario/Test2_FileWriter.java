package com.qiao.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Test2_FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("��Һ�,������ĺ�!");
		fw.write(97);
		fw.close();
	}

}
