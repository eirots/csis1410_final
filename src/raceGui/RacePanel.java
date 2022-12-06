package raceGui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class RacePanel extends JPanel {

	private JLabel playerCar;
	private JLabel cpuCar;
	private int playerXCoord;
	private int cpuXCoord;
	private JLabel playerLine;
	private JLabel cpuLine;

	/**
	 * Create the panel.
	 */
	public RacePanel() {
		playerXCoord = 6;
		 cpuXCoord = 50;

		setLayout(null);

		playerCar = new JLabel("");

		playerCar.setIcon(new ImageIcon(RacePanel.class.getResource("/img/circle1.png")));
		playerCar.setBounds(6, 42, 138, 113);

		add(playerCar);

		cpuCar = new JLabel("");

		cpuCar.setIcon(new ImageIcon(RacePanel.class.getResource("/img/circle2.png")));
		cpuCar.setBounds(6, 182, 89, 113);

		add(cpuCar);

		playerLine = new JLabel("");
		playerLine.setBounds(6, 81, 713, 36);
		playerLine.setIcon(new ImageIcon(RacePanel.class.getResource("/img/line2.png")));
		add(playerLine);

		cpuLine = new JLabel("");
		cpuLine.setBounds(6, 213, 1599, 36);
		cpuLine.setIcon(new ImageIcon(RacePanel.class.getResource("/img/line2.png")));
		add(cpuLine);
		
	}

	public void updateCpuCoord(int step) {
		remove(cpuCar);
		remove(cpuLine);

		cpuXCoord += step;
		cpuCar.setBounds(cpuXCoord, 182, 128, 113);

		add(cpuCar);
		add(cpuLine);
		revalidate();
		repaint();
	}

	public void updatePlayerCoord(int step) {
		remove(playerCar);
		remove(playerLine);

		playerXCoord += step;
		playerCar.setBounds(playerXCoord, 42, 128, 113);
		

		add(playerCar);
		add(playerLine);
		revalidate();
		update(getGraphics());
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getPlayerX() {
		return playerXCoord;
	}
	
	public int getCpuX() {
		return cpuXCoord;
	}
	
	public String getLeader() {
		if(playerXCoord < cpuXCoord) {
			return "CPU";
		}else {
			return "PLAYER";
		}
	}
}
