package com.qiao.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test2_Receive {

	/**
	 * 2.����Receive
	 * ����DatagramSocket,ָ���˿�
	 * ����DatagramPacket,ָ������,����
	 * ʹ��DatagramSocket����DatagramPacket
	 * ��DatagramPacket�л�ȡ����
	 * �ر�DatagramSocket
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		while(true) {
			socket.receive(packet);
			byte[] data = packet.getData();
			int len = packet.getLength();
			String ip = packet.getAddress().getHostAddress();
			int port = packet.getPort();
			
			System.out.println(ip + ":" + port + ":" +new String(data,0,len));
		}
	}
}
