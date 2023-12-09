package textarea_calculator;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI{
	private JFrame frame;

	
	private JTextField input;
	private JTextArea input2;

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton clear;
	
	private JButton add;
	private JButton sub;
	private JButton mul;
	private JButton div;
	private JButton equals;
	
	int sum=0;
	List<Integer> num = new ArrayList<>();
	String text="";
	String operation;
	
	GUI() {
		frame = new JFrame();
		
		input = new JTextField();
//		input.setBounds(10, 10, 290, 40); //50
		
		input2 = new JTextArea();
		input2.setBounds(10, 10, 290, 240);
		input2.setEnabled(false);
	
		
		btn1 = new JButton("1");
		btn1.setBounds(10, 260, 50, 50);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "1";
				
				
				input2.setText(text );
				
			}
			
		});
		
	
			
		btn2 = new JButton("2");
		btn2.setBounds(70, 260, 50, 50);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "2";
				input2.setText(text);
			}
			
		});
		
		btn3 = new JButton("3");
		btn3.setBounds(130, 260, 50, 50);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "3";
				input2.setText(text );
			}
			
		});
		
		btn4 = new JButton("4");
		btn4.setBounds(10, 320, 50, 50);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "4";
				input2.setText(text );
			}
			
		});
		
		btn5 = new JButton("5");
		btn5.setBounds(70, 320, 50, 50);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "5";
				input2.setText(text );
			}
			
		});
		
		btn6 = new JButton("6");
		btn6.setBounds(130, 320, 50, 50);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "6";
				input2.setText(text );
			}
			
		});
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 380, 50, 50);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "7";
				input2.setText(text );
			}
			
		});
		
		btn8 = new JButton("8");
		btn8.setBounds(70, 380, 50, 50);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "8";
				input2.setText(text );
			}
			
		});
		
		btn9 = new JButton("9");
		btn9.setBounds(130, 380, 50, 50);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "9";
				input2.setText(text );
			}
			
		});
		
		add = new JButton("+");
		add.setBounds(190, 260, 50, 50);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!text.equals("")) {
					input2.setText("");
					int temp = Integer.parseInt(text);
					
					num.add(temp);
					text="";
					for (int x : num) {
						input2.append(x + "\n");
					}
					operation = "add";
				}
				
			}
			
		});
		
		sub = new JButton("-");
		sub.setBounds(250, 260, 50, 50);
		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!text.equals("")) {
					input2.setText("");
					int temp = Integer.parseInt(text);
					
					num.add(temp);
					text="";
					for (int x : num) {
						input2.append(x + "\n");
					}
					operation = "sub";
				}
				
			}
			
		});
	
		mul = new JButton("*");
		mul.setBounds(250, 320, 50, 50);
		mul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!text.equals("")) {
					input2.setText("");
					int temp = Integer.parseInt(text);
					
					num.add(temp);
					text="";
					for (int x : num) {
						input2.append(x + "\n");
					}
					operation = "mul";
				}
				
			}
			
		});
		
		div = new JButton("/");
		div.setBounds(250, 380, 50, 50);
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!text.equals("")) {
					input2.setText("");
					int temp = Integer.parseInt(text);
					
					num.add(temp);
					text="";
					for (int x : num) {
						input2.append(x + "\n");
					}
					operation = "div";
				}
				
			}
			
		});

		equals = new JButton("=");
		equals.setBounds(190, 320, 50, 50);
		equals.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!text.equals("")) {
					int temp = Integer.parseInt(text);
				
					num.add(temp);
					text="";
				}
				if (!num.isEmpty()) {
					input2.setText("");
					if (operation.equals("add")) {
						for (int x : num) {
							input2.append(x + "\n");
							sum += x;
						}
					}
					else if (operation.equals("sub")) {
						for (int x : num) {
							if (!(num.indexOf(x) == 0)) {
								input2.append(x + "\n");
								sum -= x;
							}
							else {
								sum = x;
							}
						}
					}
					else if (operation.equals("mul")) {
						for (int x : num) {
							if (!(num.indexOf(x) == 0)) {
								input2.append(x + "\n");
								sum *= x;
							}
							else {
								sum = x;
							}
						}
					}
					else if (operation.equals("div")) {
						for (int x : num) {
							if (!(num.indexOf(x) == 0)) {
								input2.append(x + "\n");
								sum = sum / x;
							}
							else {
								sum = x;
							}
						}
					}
					
					input2.append("= " + sum);
				}
				sum = 0;
				num.clear();
			}
			
		});
	
		clear = new JButton("AC");
		clear.setBounds(190, 380, 50, 50);
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num.clear();
				text="";
				sum=0;
				input2.setText("");
				
			}
			
		});
		
		
		frame.add(clear);
		frame.add(input2);
		frame.add(input);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);
		frame.add(equals);
		frame.setLayout(null);
		frame.setSize(325, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		
	}

}