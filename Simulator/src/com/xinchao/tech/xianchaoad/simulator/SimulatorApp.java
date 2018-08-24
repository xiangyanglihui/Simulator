package com.xinchao.tech.xianchaoad.simulator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SimulatorApp {

	public static void main(String[] args) {
		Display display = Display.getDefault(); // 1.创建一个Display
		Shell shell = new Shell();// 2.创建一个或者多个Shell(shell是程序的主窗口)
		shell.setSize(450, 300);// 3.设置Shell的布局(设置主窗口的大小)
		shell.setText("模拟器");
		// 4.创建Shell中的组件(这个例子中没有加入组件,只是一个空窗口)
		shell.open();// 5.用Open()方法打开Shell窗口 打开shell主窗口
		shell.layout();// shell应用界面布置
		// 6.写一个事件转发循环.
		while (!shell.isDisposed()) {// 如果主窗口没有关闭,则一直循环
			if (!display.readAndDispatch()) {// 如果display不忙
				display.sleep();// display休眠
			}
		}

	}

}
