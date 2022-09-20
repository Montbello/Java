package hauptPaket;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Augusto extends JFrame
{
	class FarbKlasse implements ActionListener
	{
		private boolean ttt = true;
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Ich bin ein Objekt von der INNERKLASE!!");			
			if(ttt)
			{
				btnNewButton.setBackground(Color.yellow);
				ttt =!ttt;
			}
			else
			{
				btnNewButton.setBackground(Color.red);
				ttt =!ttt;
			}
		}		
	}
	
	
	public JButton btnNewButton;
	
	
	public Augusto() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLocation(100, 100);
			setSize(685, 584);		//DAS ZUERST IN GOTTES NAMEN!!!!!	
		Dimension d = getToolkit().getScreenSize();
		int startPosX=0;
		int startPosY =0;
		startPosX =(int)  (d.getWidth()-getWidth())/2;
		startPosY =(int)  (d.getHeight()-getHeight())/2;
		
		setLocation(startPosX,startPosY);

		
		
		btnNewButton = new JButton("Teste mich, ein Button");
		ClickKlasse einClickVerehrer = new ClickKlasse();
		//FarbKlasse xyz = new FarbKlasse();
		btnNewButton.addActionListener(einClickVerehrer);
		btnNewButton.addActionListener(new FarbKlasse());
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		setVisible(true);
	}


	public static void main(String[] args)
	{
		Augusto a = new Augusto();

	}

}
