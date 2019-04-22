package com.qiao.otherio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test07_SystemIn {

	/**
	 * @param args
	 * 两种方式实现键盘输入
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		sc.close();
	}

	private static void demo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println(line);
		br.close();
	}

}
