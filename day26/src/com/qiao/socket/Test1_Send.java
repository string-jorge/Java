package com.qiao.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test1_Send {

	/**
	 * 1.发送send
	 * 创建DatagramSocket(相当于码头),随机端口号
	 * 创建DatagramPacket(相当于集装箱),指定数据,长度,地址,端口号
	 * 使用DatagramSocket发送DatagramPacket(相当于发货)
	 * 关闭DatagramSocket
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
