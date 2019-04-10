import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.JComponent; 
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class BankAccountFrame extends JFrame
{
	

	public BankAccountFrame()
	{
		JMenuBar bankMenuBar = new JMenuBar();
	
		// Base
		this.setBounds(100, 100, 500, 300);
		this.setVisible(true);
		this.setLayout(new GridBagLayout());
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		// Card Layout - OLD
		//CardLayout cardL = new CardLayout();
		JPanel generic = new JPanel();
		generic.setLayout(new GridBagLayout());
		
		// Setting menu bars and items.
		
		JMenu accMenu = new JMenu("Account");
		JMenuItem addAcc = new JMenuItem("Add Account");
		JMenuItem remAcc = new JMenuItem("Remove Account");
		accMenu.add(addAcc);
		accMenu.add(remAcc);
		bankMenuBar.add(accMenu);
		JMenu transMenu = new JMenu("Transaction");
		JMenuItem depositOp = new JMenuItem("Deposit");
		JMenuItem withdrawOp = new JMenuItem("Withdraw");
		JMenuItem transferOp = new JMenuItem("Transfer");
		transMenu.add(depositOp);
		transMenu.add(withdrawOp);
		transMenu.add(transferOp);
		bankMenuBar.add(transMenu);
		JMenu homeOp = new JMenu("Home");
		JMenuItem home = new JMenuItem("Return Home");
		homeOp.add(home);
		bankMenuBar.add(homeOp);
	
		this.setJMenuBar(bankMenuBar);
		JPanel homePan = new JPanel();
		homePan.setLayout(new GridBagLayout());
		JLabel welcomeMessage = new JLabel("WELCOME TO SCAM CORP: WHERE YOUR INVESTMENT IS OUR INVESTMENT");
		homePan.add(welcomeMessage);
		

		
		
		// Option Panels
		AddAccount addAccPanel = new AddAccount();
		RemoveAccount remAccPanel = new RemoveAccount();
		Withdraw withdrawPanel = new Withdraw();
		Deposit depositPanel = new Deposit();
		Transfer transPanel = new Transfer();
		
		generic.add(addAccPanel);
		generic.add(remAccPanel);
		generic.add(withdrawPanel);
		generic.add(depositPanel);
		generic.add(transPanel);
		
		homePan.setVisible(true);
		addAccPanel.setVisible(true);
		this.add(generic);
		
	}
	
	public static void main(String[]args)
	{
		BankAccountFrame myFrame = new BankAccountFrame();
		
	}
}
