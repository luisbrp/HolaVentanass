import javax.swing.JPanel;
import javax.swing.JButton;

public class principal extends JPanel {

	/**
	 * Create the panel.
	 */
	public principal() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(204, 213, 89, 40);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(204, 128, 89, 40);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(204, 47, 89, 40);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(204, 289, 89, 40);
		add(btnNewButton_3);

	}
}
