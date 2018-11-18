/**   class to create a change colour panel
 *    @author Andres Herrera
 *    @version 02/03/2017
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class ChangeColour extends JFrame implements ActionListener
{
	
	private JButton blue= new JButton("Set background to blue");
	private JButton red= new JButton("Set background to red");
	
	
	public ChangeColour()
	{
		setTitle("Change Colour");
		setLayout(new FlowLayout());
		add(blue);
		add(red);
		blue.addActionListener(this);
		red.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1670,1000);
		setLocation(5,5);
		getContentPane().setLayout(new FlowLayout());
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent k)
	{
		if(k.getSource()== blue)
		{
			getContentPane().setBackground(Color.BLUE);
		}
		
		if(k.getSource()== red)
		{
			getContentPane().setBackground(Color.RED);
		}
		
	}
}
