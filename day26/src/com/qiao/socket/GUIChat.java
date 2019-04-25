package com.qiao.socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * UDP聊天
 */

public class GUIChat {

	private static Frame frame;
	private static TextField IPText;
	private static Button send;
	private static Button log;
	private static Button clear;
	private static Button shake;
	private static TextArea viewText;
	private static TextArea sendText;
	private DatagramSocket socket;
	private BufferedWriter bw;

	public GUIChat() {
		
		createFrame();

		createSouthPanel();

		createCenterPanel();
		
		event();
		
	}

	// 事件
	public void event() {
		
		// 窗体监听,退出程序
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				try {
					socket.close();
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
			
		});
		
		// send设置动作监听,发送
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		
		// log设置动作监听,聊天记录
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		});
		
		// clear设置动作监听,清屏
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
			
		});

		// 设置动作监听,震动
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send(new byte[] {-1},IPText.getText());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		});
		
		//快捷键按下center发送
		sendText.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if((e.getKeyCode() == KeyEvent.VK_ENTER) || (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown())) {
					try {
						send();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
			
		});

	}

	// 震动
	private void shake() {
		
		int x = frame.getLocation().x;
		int y = frame.getLocation().y;
		
		for (int i = 0; i < 10; i++) {
			try {
				frame.setLocation(x + 15, y + 15);
				Thread.sleep(30);
				frame.setLocation(x + 15, y - 15);
				Thread.sleep(30);
				frame.setLocation(x - 15, y + 15);
				Thread.sleep(30);
				frame.setLocation(x - 15, y + 15);
				Thread.sleep(30);
				frame.setLocation(x, y);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	// 聊天记录
	private void logFile() throws IOException {
		
		bw.flush();
		
		FileInputStream fis = new FileInputStream("config.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int len;
		byte[] arr = new byte[8192];
		while((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		
		String str = baos.toString();
		viewText.setText(str);
		
		fis.close();
		baos.close();
		
	}
	
	// 重载send
	private void send(byte[] arr,String ip) throws IOException {
		
		DatagramPacket packet = new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 10000);
		
		socket.send(packet);
		
	}

	// 发送功能
	private void send() throws Exception {
		
		String message = sendText.getText();
		if(message.equals("")) {
			viewText.append("发送内容不能为空!\r\n");
		} else {
			String time = getCurrentTime();
			String ip = IPText.getText();
			ip = ip.trim().length() == 0 ? "255.255.255.255" : ip;
			
			send(message.getBytes(),ip);
			
			String str = time + " 我对 " + (ip.equals("255.255.255.255") ? "所有人" : ip) + " 说:\r\n" + message + "\r\n\r\n";
			viewText.append(str);
			bw.write(str);
			sendText.setText("");
		}
		
	}
	
	// 接收
	class Receive extends Thread {
		
		@Override
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(10000);
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);
				while(true) {
					socket.receive(packet);
					
					byte[] arr = packet.getData();
					int length = packet.getLength();
					if(arr[0] == -1 && length == 1) {
						shake();
						continue;
					} else {
						String message = new String(arr, 0, length);
						String time = getCurrentTime();
						String ip = packet.getAddress().getHostAddress();
						
						String str = time + " " + ip + " 对我说:\r\n" + message + "\r\n\r\n";
						viewText.append(str);
						bw.write(str);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	// 获取当前时间
	private String getCurrentTime() {
		
		Date time = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return sdf.format(time);
		
	}

	// 创建中间的Panel
	public void createCenterPanel() {
		
		Panel centerPanel = new Panel();
		
		viewText = new TextArea();
		sendText = new TextArea(8,1);
		
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);
		viewText.setFont(new Font("xxx", Font.PLAIN, 12));
		
		sendText.setFont(new Font("xxx", Font.PLAIN, 12));
		
		centerPanel.setLayout(new BorderLayout());
		
		centerPanel.add(sendText,BorderLayout.SOUTH);
		centerPanel.add(viewText,BorderLayout.CENTER);
		
		frame.add(centerPanel);
		
	}

	// 创建南边的Panel
	public void createSouthPanel() {

		Panel southPanel = new Panel();

		IPText = new TextField(20);
		IPText.setText("127.0.0.1");

		send = new Button("发 送");
		log = new Button("记 录");
		clear = new Button("清 屏");
		shake = new Button("震 动");

		southPanel.add(IPText);

		southPanel.add(send);
		southPanel.add(log);
		southPanel.add(clear);
		southPanel.add(shake);

		frame.add(southPanel, BorderLayout.SOUTH);

	}

	// 创建窗体
	public void createFrame() {

		frame = new Frame("GUIChat");
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("logo.jpg"));
		new Receive().start();
		try {
			bw = new BufferedWriter(new FileWriter("config.txt",true));
			socket = new DatagramSocket();
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setVisible(true);

	}
	
	public static void main(String[] args) {

		new GUIChat();

	}
	
}
