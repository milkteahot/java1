package View;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Model.Player;

public class myView extends JFrame {
	 
    public Player p1,p2;
    
    private JPanel contentPane;
    JProgressBar bar1 = new JProgressBar();
    JProgressBar bar2 = new JProgressBar();
    JButton bt1 = new JButton("attack");
    JButton bt2 = new JButton("attack");
    JTextArea textArea = new JTextArea();
    
    
    public static void main(String[] args) {
        
        myView frame = new myView();
        frame.setVisible(true);
        
    }
 
    
    public void setPlayer() {
        p1=new Player("Goblin", 100);
        p2=new Player("Vampire", 100);
        
        p1.setHp(100);
        p2.setHp(100);        
        p1.setPower(30);
        p2.setPower(20);
        
        
    }
    
    public myView() {
        ///////////////////////////////
        setPlayer();
        
        
        /////////////////////////////
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1105, 592);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.ORANGE);
        panel1.setBounds(22, 26, 285, 433);
        contentPane.add(panel1);
        panel1.setLayout(null);
        
        
        bar1.setValue(100);
        bar1.setForeground(Color.RED);
        bar1.setBounds(12, 10, 261, 21);
        panel1.add(bar1);
        
        JLabel label1 = new JLabel("");
        label1.setIcon(new ImageIcon("./src/goblin2.png"));
        label1.setBackground(Color.YELLOW);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setBounds(48, 51, 172, 235);
        panel1.add(label1);
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String str=p1.attack(p2);
                bar2.setValue(p2.getHp());
                
                
                textArea.setText(textArea.getText()+str +"\r\n");
                
                
            }
        });
        
        
        bt1.setBackground(Color.YELLOW);
        bt1.setForeground(Color.BLUE);
        bt1.setFont(new Font("굴림", Font.BOLD, 14));
        bt1.setBounds(48, 334, 160, 64);
        panel1.add(bt1);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.ORANGE);
        panel2.setBounds(792, 26, 285, 433);
        contentPane.add(panel2);
        
        
        bar2.setValue(100);
        bar2.setForeground(Color.RED);
        bar2.setBounds(12, 10, 261, 21);
        panel2.add(bar2);
        
        JLabel label2 = new JLabel("");
        label2.setIcon(new ImageIcon("./src/vampire.png"));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setBackground(Color.YELLOW);
        label2.setBounds(80, 70, 172, 235);
        panel2.add(label2);
        
        JButton bt2 = new JButton("attack");
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String str=p2.attack(p1);
                bar1.setValue(p1.getHp());        

                String str2 = p2.absorbHp(p1);
                textArea.setText(textArea.getText()+str +"\r\n"+str2);
                
            }
        });
        bt2.setForeground(Color.BLUE);
        bt2.setFont(new Font("굴림", Font.BOLD, 14));
        bt2.setBackground(Color.YELLOW);
        bt2.setBounds(48, 334, 160, 64);
        panel2.add(bt2);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(331, 26, 449, 433);
        contentPane.add(scrollPane);
        
        
        scrollPane.setViewportView(textArea);
    }
}