package com.qiao.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	/**
	 * 给图片加密
	 * 将写出的字节异或上一个数,这个数就是密钥,解密的时候再次异或就可以了
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.png"));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 990628);
		}
		
		bis.close();
		bos.close();
	}

}
