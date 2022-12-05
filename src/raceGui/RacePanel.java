package raceGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RacePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public RacePanel() {
		setLayout(null);
		
		JLabel playerLine = new JLabel("");
		playerLine.setIcon(new ImageIcon(RacePanel.class.getResource("/img/line1.png")));
		playerLine.setBounds(-71, 76, 1099, 16);
		add(playerLine);
		
		JLabel cpuLine = new JLabel("");
		cpuLine.setIcon(new ImageIcon(RacePanel.class.getResource("/img/line1.png")));
		cpuLine.setBounds(-90, 252, 1099, 16);
		add(cpuLine);

	}

}
