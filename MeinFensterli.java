package haup;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class MeinFensterli extends JFrame
{
	public static void main(String[] args)
	{
		MeinFensterli augusto = new MeinFensterli();
		augusto.setVisible(true);
	}

	public MeinFensterli()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 537 );
		getContentPane().setBackground(Color.yellow);
		
		JButton btnHallo = new JButton("HAllo");
		getContentPane().add(btnHallo, BorderLayout.SOUTH);
	}

}
