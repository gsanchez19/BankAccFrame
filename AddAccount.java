import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddAccount extends JPanel {

	public AddAccount()
	{
		this.setLayout(new GridBagLayout());
		JLabel accLabel = new JLabel("Account:");
		this.add(accLabel);
		
	}
	
}
