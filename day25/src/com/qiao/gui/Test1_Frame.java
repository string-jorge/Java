package com.qiao.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test1_Frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame("Java");	//��������
		
		f.setSize(520,520);		//���ô����С
		f.setLocationRelativeTo(null);		//���ô��忪ʼ��������Ļ����
		f.setLayout(new FlowLayout());		//���ò��ֹ�����
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("images.jpg"));		//����ͷ��
		f.addWindowListener(new WindowAdapter() {			//��Ӵ������
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);		//���ô���ɼ�
		
		Button b1 = new Button("button_one");		//������ť
		Button b2 = new Button("button_two");
		
		b2.addActionListener(new ActionListener() {		//��Ӷ�������
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		b1.addMouseListener(new MouseAdapter() {		//���������
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		b1.addKeyListener(new KeyAdapter() {		//��Ӽ��̼���
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.exit(0);
				}
			}
		});
		f.add(b1);
		f.add(b2);
	}

}
