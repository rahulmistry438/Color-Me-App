import javax.swing.*;		// JFrame, Jlabel, JButton
import java.awt.*;	        // Container, Font, Color
import java.awt.event.*;	// ActionListener

class App extends JFrame
{
	Container c;
	JButton btn;
	
	App()
	{
		c = getContentPane();
		c.setLayout(null);
		Font f = new Font("Times New Roman", Font.BOLD, 40);
		btn = new JButton("Color Me");
		btn.setFont(f);
		btn.setBounds(50, 100, 400, 60);
		c.add(btn);

		ActionListener a = (ae) -> {
		//write code to set the background to random color on each click
		//s1 Create Array/ArrayList
		Color col[] = {Color.RED, Color.BLUE, Color.GREEN, Color.PINK, Color.GRAY, Color.CYAN};

		//s2 generate random r
		int r = (int)(Math.random() * col.length);

		//s3 setBackGround
		c.setBackground(col[r]);
		};
		btn.addActionListener(a);
	}
}

class P3
{
	public static void main(String args[])
	{
		App a = new App();
		a.setSize(500, 500);
		a.setLocationRelativeTo(null);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setTitle("App by J020_Rahul Mistry_PVPPCOE");
		a.setVisible(true);
	}
}
