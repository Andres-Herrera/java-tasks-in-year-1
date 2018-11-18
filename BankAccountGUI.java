/**   Gui for the bank account class
 *    @authors:Andres Herrera
 *    @version 20/12/2016
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankAccountGUI extends JFrame implements ActionListener
{
	
	private JLabel amountLabel = new JLabel("Amount");
	private JTextField amountField = new JTextField(5);
	private JButton depositButton = new JButton("DEPOSIT");
	private JButton withdrawButton = new JButton("WITHDRAW");
	private JLabel balanceLabel = new JLabel("Starting Balance = 0" );
	
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	// declare a third Panel (called middlePanel) here
	private JPanel middlePanel= new JPanel();
	
	
	// declare a new BankAccount object (myAccount) with account number and name of your choice here
	private BankAccount myAccount= new BankAccount("1536951", "Andres Herrera");
	
	public BankAccountGUI()
	{
		setTitle("BankAccount GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setSize(340, 145);
		setLocation(300,300);
		depositButton.addActionListener(this);
		withdrawButton.addActionListener(this);
		
		topPanel.add(amountLabel);
		topPanel.add(amountField);
		bottomPanel.add(balanceLabel);
		// add the buttons to the middlePanel here
		middlePanel.add(depositButton);
		middlePanel.add(withdrawButton);
		
		add (BorderLayout.NORTH, topPanel);
		add(BorderLayout.SOUTH, bottomPanel);
		add (BorderLayout.CENTER, middlePanel);
		// add the middlePanel to the CENTER of the frame here
		
			
		setVisible(true);
	}
	
 
	public void actionPerformed(ActionEvent e)
	{
		// write code to get text from amountField and convert to double here
		String amountTxt= amountField.getText();
		double amount= Double.parseDouble(amountTxt);
		
		// write event handler for deposit button here
			
		
		// write event handler for withdraw button here
		if (e.getSource()== depositButton)
		{
			myAccount.deposit(amount);
			balanceLabel.setText("New balance= " +myAccount.getBalance());
			
		}
		else if(e.getSource()== withdrawButton)
		{
			if(myAccount.withdraw(amount)== false)
			{
				balanceLabel.setText("Not enough money, please try an amount less than" + myAccount.getBalance());
			}
			else
			{	
				myAccount.withdraw(amount);
				balanceLabel.setText("Balance after withdraw= "+myAccount.getBalance());
			}
		}
	
	}
}
