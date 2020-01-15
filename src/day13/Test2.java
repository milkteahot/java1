import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Test2 extends JFrame {

	private JPanel contentPane;
	private JProgressBar bar1;
	private JLabel label1;
	private JButton bt11;
	private JProgressBar bar2;
	private JLabel label2;
	private JButton bt21;
	private JButton bt12;
	private JButton bt13;
	private JButton bt22;
	private JButton bt23;
	JTextArea textArea = new JTextArea();
	String str= "";
	private JLabel l1;
	private JLabel l2;
	private JButton savebt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	////////////////////////////////
	public void labelFreeze(JLabel l) {
		l.setEnabled(false);
	}
	public void btFreeze(JButton b) {
		b.setEnabled(false);
	}
	public void explode(JProgressBar pb) {
		int num = pb.getValue();
		num -= 10;
		pb.setValue(num);
	}
	public void heal(JProgressBar pb) {
		int num = pb.getValue();
		num += 10;
		pb.setValue(num);
	}
	public void flame(JProgressBar pb) {
		int num = pb.getValue();
		num -= 30;
		pb.setValue(num);
	}
	
	public void showMsg(JLabel l1, JLabel l2) {
		
		str = l1.getText() + "  ===attack===>  " + l2.getText() +"\r\n"; 
		System.out.println(str);
		textArea.append(str);
		
	}
	
	
	///////////////////////////////

	/**
	 * Create the frame.
	 */
	public Test2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 139, 87));
		panel.setBounds(12, 31, 257, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		bar1 = new JProgressBar();
		bar1.setForeground(new Color(0, 128, 128));
		bar1.setValue(100);
		bar1.setBackground(new Color(0, 0, 0));
		bar1.setBounds(0, 10, 257, 39);
		panel.add(bar1);
		
		label1 = new JLabel("");
		label1.setIcon(new ImageIcon("D:\\slytherin.jpg"));
		label1.setBounds(0, 59, 257, 269);
		panel.add(label1);
		
		bt11 = new JButton("Explode");
		bt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				explode(bar2);
				str = l1.getText() + "  === Explode(-10) ===>  " + l2.getText() +"\r\n"; 
				textArea.append(str);
				
				if(bar2.getValue()<=0) {
					labelFreeze(label2);
					btFreeze(bt21);
				}
			}
		});
		bt11.setForeground(new Color(255, 255, 255));
		bt11.setBackground(new Color(0, 128, 128));
		bt11.setBounds(0, 324, 257, 39);
		panel.add(bt11);
		
		bt12 = new JButton("Heal");
		bt12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				heal(bar1);
				str = l1.getText() + "   Heal(+10)   \r\n"; 
				textArea.append(str);
				}
			}
		);
		bt12.setForeground(Color.WHITE);
		bt12.setBackground(new Color(0, 153, 102));
		bt12.setBounds(0, 361, 257, 39);
		panel.add(bt12);
		
		bt13 = new JButton("Flame");
		bt13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flame(bar2);
				str = l1.getText() + "  === Flame(-30) ===>  " + l2.getText() +"\r\n"; 
				textArea.append(str);
				if(bar2.getValue()<=0) {
					labelFreeze(label2);
					btFreeze(bt21);
				}
			}
		});
		bt13.setBounds(0, 399, 257, 39);
		panel.add(bt13);
		bt13.setForeground(Color.WHITE);
		bt13.setBackground(new Color(0, 128, 128));
		
		l1 = new JLabel("Slytherin");
		l1.setBounds(0, 59, 57, 15);
		panel.add(l1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(218, 165, 32));
		panel_1.setBounds(552, 31, 250, 438);
		contentPane.add(panel_1);
		
		bar2 = new JProgressBar();
		bar2.setValue(100);
		bar2.setForeground(new Color(128, 0, 0));
		bar2.setBackground(new Color(0, 0, 0));
		bar2.setBounds(0, 10, 250, 39);
		panel_1.add(bar2);
		
		label2 = new JLabel("");
		label2.setIcon(new ImageIcon("D:\\gryffindor.jpg"));
		label2.setBounds(0, 62, 268, 262);
		panel_1.add(label2);
		
		bt21 = new JButton("Explode");
		bt21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				explode(bar1);
				str = l2.getText() + "  === Explode(-10) ===>  " + l1.getText() +"\r\n"; 
				textArea.append(str);
				
				if(bar1.getValue()<=0) {
					labelFreeze(label1);
					btFreeze(bt11);
				}
			}
		});
		bt21.setForeground(new Color(255, 255, 255));
		bt21.setBackground(new Color(165, 42, 42));
		bt21.setBounds(0, 322, 250, 41);
		panel_1.add(bt21);
		
		bt22 = new JButton("Heal");
		bt22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heal(bar2);
				str = l2.getText() + "   Heal(+10)  \r\n"; 
				textArea.append(str);
				}
			}
		);
		bt22.setForeground(Color.WHITE);
		bt22.setBackground(new Color(255, 204, 51));
		bt22.setBounds(0, 362, 250, 39);
		panel_1.add(bt22);
		
		bt23 = new JButton("Flame");
		bt23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flame(bar1);
				str = l2.getText() + "  === Flame(-30) ===>  " + l1.getText() +"\r\n"; 
				textArea.append(str);
				if(bar1.getValue()<=0) {
					labelFreeze(label1);
					btFreeze(bt11);
				}
			}
		});
		bt23.setBounds(0, 397, 250, 41);
		panel_1.add(bt23);
		bt23.setForeground(Color.WHITE);
		bt23.setBackground(new Color(165, 42, 42));
		
		l2 = new JLabel("Gryffindor");
		l2.setBounds(0, 59, 57, 15);
		panel_1.add(l2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 31, 257, 438);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		savebt = new JButton("\uC800\uC7A5\uD558\uAE30");
		savebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("D:\\data.log");
				PrintWriter out = null;
				
				try {
					out = new PrintWriter(file);
				} catch (FileNotFoundException e1) {
					System.out.println("no file...");
				}
				out.println( textArea.getText() );
				out.close();
			}

			
		});
		savebt.setBounds(361, 479, 97, 23);
		contentPane.add(savebt);
	}
}
