import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class my_frame extends JFrame implements ActionListener
{
	Container c;
	JLabel label1,label2,label3;
	ImageIcon icon1,icon2,icon3,icon4,icon5;
	Color color1,color2,color3,color4,color5;
	JButton b1,b2,b3;
	Font f1,f2;
	JTextField tf1,tf2;
    
	my_frame()
	{	
		JFrame first=new JFrame();     // First frame
		setLocation(450,10);
		setSize(500,650);                 // frame design
		setResizable(false);
		setTitle("COUNT THE WORDS");
		
		
		c=getContentPane();   // container
		c.setLayout(null);
		
		color1=new Color(131, 149, 167);
		c.setBackground(color1);
		
		label2=new JLabel("COUNT THE WORDS");
		f1=new Font("arial",Font.BOLD,25); 
		label2.setFont(f1);
		label2.setBounds(100,0,250,180);
		label2.setForeground(Color.WHITE);
		c.add(label2);
		
		label3=new JLabel("Enter sentence : ");
		f1=new Font("arial",Font.BOLD,20); 
		label3.setFont(f1);
		label3.setBounds(30,100,250,180);
		label3.setForeground(Color.WHITE);
		c.add(label3);
		
		tf1=new JTextField();
		tf1.setBounds(30,200,420,60);
		color2=new Color(29,9,52);
		tf1.setBackground(color2);
		tf1.setForeground(Color.YELLOW);
		tf1.setHorizontalAlignment(JTextField.LEFT);
		Font f1=new Font("Lucida Bright",Font.BOLD,20);
		tf1.setFont(f1);
		tf1.setEditable(true);
		c.add(tf1);
		
		// buttons
		
		color3=new Color(29,9,52);
		color4=new Color(210,218,226);
		Font f2=new Font("Lucida Bright",Font.BOLD,23);
		
		b1=new JButton("COUNT");
		b1.setVisible(true);
		b1.setEnabled(true);
		b1.setForeground(color3);
		b1.setBackground(color4);
		b1.setBounds(30,300,160,50);
		b1.setFont(f2);
		c.add(b1);
		
		b2=new JButton("CLEAR");
		b2.setVisible(true);
		b2.setEnabled(true);
		b2.setForeground(color3);
		b2.setBackground(color4);
		b2.setBounds(285,300,160,50);
		b2.setFont(f2);
		c.add(b2);
		
		// result
		
		label1=new JLabel("Total Words : ");
		label1.setFont(f1);
		label1.setBounds(30,350,250,180);
		label1.setForeground(Color.WHITE);
		c.add(label1);
		
		tf2=new JTextField();
		tf2.setBounds(30,450,420,60);
		color2=new Color(29,9,52);
		tf2.setBackground(color2);
		tf2.setForeground(Color.YELLOW);
		tf2.setHorizontalAlignment(JTextField.LEFT);
		tf2.setFont(f1);
		tf2.setEditable(false);
		c.add(tf2);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public  void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1){
			String s1=tf1.getText();
			String ar[]=s1.split(" ");
			int n=ar.length;
			String ch =Integer.toString(n);
			tf2.setText(ch);
		}
		if(e.getSource()==b2){
			String s1=tf1.getText();
			s1="";
			tf1.setText(s1);
			tf2.setText(s1);
		}
	}
}

class myword
{
	public static void main(String str[])
	{
		my_frame frame= new my_frame();
	}
}
