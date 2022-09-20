package guiPaket;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MeineGrafik extends JFrame
{
	public JPanel commandoPanel;

	public MeineGrafik()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setLocation(200, 200);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		commandoPanel = new JPanel();
		getContentPane().add(commandoPanel, BorderLayout.SOUTH);
	}
}
