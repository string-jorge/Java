package com.qiao.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test1_Send {

	/**
	 * 1.����send
	 * ����DatagramSocket(�൱����ͷ),����˿ں�
	 * ����DatagramPacket(�൱�ڼ�װ��),ָ������,����,��ַ,�˿ں�
	 * ʹ��DatagramSocket����DatagramPacket(�൱�ڷ���)
	 * �ر�DatagramSocket
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String str = "What are you doing?";
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = 
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		
		socket.send(packet);
		
		socket.close();
	}

}
