package com.qiao.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Test2_Send {

	/**
	 * 1.����send
	 * ����DatagramSocket,����˿ں�
	 * ����DatagramPacket,ָ������,����,��ַ,�˿ں�
	 * ʹ��DatagramSocket����DatagramPacket
	 * �ر�DatagramSocket
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();
		while(true) {
			String str = sc.nextLine();
			if("quit".equals(str)) {
				break;
			}
			DatagramPacket packet = 
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);
		}
		socket.close();
	}

}
