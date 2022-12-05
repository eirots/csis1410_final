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
		playerLine.setIcon(new ImageIcon(RacePanel.class.getResource("/img/line2.png")));
		playerLine.setBounds(6, 81, 713, 36);
		add(playerLine);
		
		JLabel cpuLine = new JLabel("");
		cpuLine.setIcon(new ImageIcon(RacePanel.class.getResource("/img/line2.png")));
		cpuLine.setBounds(6, 213, 1599, 36);
		add(cpuLine);

	}

}
