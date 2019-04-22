package com.qiao.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.qiao.bean.Person;

public class Test04_ObjectInputStream {

	/**
	 * @param args
	 * 反序列化:对象输入流
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//demo1();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
		ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
		
		for (Person person : list) {
			System.out.println(person);
		}
		ois.close();
	}

	private static void demo1() throws IOException, FileNotFoundException,ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		//Person p3 = (Person) ois.readObject();		//当文件读到末尾时出现EOFException
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}

}
