package com.qiao.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test1_Receive {

	/**
	 * 2.接收Receive
	 * 创建DatagramSocket,指定端口
	 * 创建DatagramPacket,指定数据,长度
	 * 使用DatagramSocket接收DatagramPacket
	 * 从DatagramPacket中获取数据
	 * 关闭DatagramSocket
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		
		socket.receive(packet);
		
		byte[] data = packet.getData();
		int len = packet.getLength();
		
		System.out.println(new String(data,0,len));
		
		socket.close();
		
	}

}
