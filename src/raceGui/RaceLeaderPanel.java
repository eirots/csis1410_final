package raceGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class RaceLeaderPanel extends JPanel {

	private JLabel leaderLabel;

	/**
	 * Create the panel.
	 */
	public RaceLeaderPanel() {
		setLayout(null);
		
		leaderLabel = new JLabel("");
		leaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		leaderLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		leaderLabel.setBounds(6, 6, 282, 40);
		add(leaderLabel);

	
	}
	
	public void updateLeaderLabel(String text) {
		leaderLabel.setText(text);
	}
	

}
