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
 * UDP����
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

	// �¼�
	public void event() {
		
		// �������,�˳�����
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
		
		// send���ö�������,����
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
		
		// log���ö�������,�����¼
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
		
		// clear���ö�������,����
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
			
		});

		// ���ö�������,��
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
		
		//��ݼ�����center����
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

	// ��
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

	// �����¼
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
	
	// ����send
	private void send(byte[] arr,String ip) throws IOException {
		
		DatagramPacket packet = new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 10000);
		
		socket.send(packet);
		
	}

	// ���͹���
	private void send() throws Exception {
		
		String message = sendText.getText();
		if(message.equals("")) {
			viewText.append("�������ݲ���Ϊ��!\r\n");
		} else {
			String time = getCurrentTime();
			String ip = IPText.getText();
			ip = ip.trim().length() == 0 ? "255.255.255.255" : ip;
			
			send(message.getBytes(),ip);
			
			String str = time + " �Ҷ� " + (ip.equals("255.255.255.255") ? "������" : ip) + " ˵:\r\n" + message + "\r\n\r\n";
			viewText.append(str);
			bw.write(str);
			sendText.setText("");
		}
		
	}
	
	// ����
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
						
						String str = time + " " + ip + " ����˵:\r\n" + message + "\r\n\r\n";
						viewText.append(str);
						bw.write(str);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	// ��ȡ��ǰʱ��
	private String getCurrentTime() {
		
		Date time = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return sdf.format(time);
		
	}

	// �����м��Panel
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

	// �����ϱߵ�Panel
	public void createSouthPanel() {

		Panel southPanel = new Panel();

		IPText = new TextField(20);
		IPText.setText("127.0.0.1");

		send = new Button("�� ��");
		log = new Button("�� ¼");
		clear = new Button("�� ��");
		shake = new Button("�� ��");

		southPanel.add(IPText);

		southPanel.add(send);
		southPanel.add(log);
		southPanel.add(clear);
		southPanel.add(shake);

		frame.add(southPanel, BorderLayout.SOUTH);

	}

	// ��������
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
