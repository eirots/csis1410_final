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
		
		JLabel leaderHeader = new JLabel("LEADER:");
		leaderHeader.setHorizontalAlignment(SwingConstants.CENTER);
		leaderHeader.setFont(new Font("Monaco", Font.BOLD, 30));
		leaderHeader.setBounds(6, 6, 135, 40);
		add(leaderHeader);
		
		leaderLabel = new JLabel("PLAYER");
		leaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		leaderLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		leaderLabel.setBounds(153, 6, 135, 40);
		add(leaderLabel);

	
	}
	
	public void updateLeaderLabel(String text) {
		leaderLabel.setText(text);
	}
	

}
