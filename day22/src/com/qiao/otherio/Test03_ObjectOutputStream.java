package com.qiao.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.qiao.bean.Person;

public class Test03_ObjectOutputStream {

	/**
	 * @param args
	 * ���л�:���������(������д���ļ���)
	 * 		Person��Ҫʵ��Serializable�ӿڲ���д
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//demo1();
		Person p1 = new Person("����",23);
		Person p2 = new Person("����",24);
		Person p3 = new Person("����",25);
		Person p4 = new Person("����",26);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
		oos.writeObject(list);
	}

	private static void demo1() throws IOException, FileNotFoundException {
		Person p1 = new Person("����",23);
		Person p2 = new Person("����",24);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
	}

}
