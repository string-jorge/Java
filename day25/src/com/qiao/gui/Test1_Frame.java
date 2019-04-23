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
		Frame f = new Frame("Java");	//创建窗体
		
		f.setSize(520,520);		//设置窗体大小
		f.setLocationRelativeTo(null);		//设置窗体开始运行在屏幕中央
		f.setLayout(new FlowLayout());		//设置布局管理器
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("images.jpg"));		//设置头标
		f.addWindowListener(new WindowAdapter() {			//添加窗体监听
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);		//设置窗体可见
		
		Button b1 = new Button("button_one");		//创建按钮
		Button b2 = new Button("button_two");
		
		b2.addActionListener(new ActionListener() {		//添加动作监听
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		b1.addMouseListener(new MouseAdapter() {		//添加鼠标监听
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		b1.addKeyListener(new KeyAdapter() {		//添加键盘监听
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
