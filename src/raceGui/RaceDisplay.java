package raceGui;

import java.util.Random;

import javax.swing.JPanel;

import car.Body;
import car.Car;
import car.Engine;
import car.EngineBlock;
import car.Frame;
import car.TireType;
import car.Tires;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RaceDisplay extends JPanel {
	private JPanel mainPanel;
	private RacePanel racePanel;
	private RaceLeaderPanel raceLeaderPanel;

	/**
	 * Create the panel.
	 */
	public RaceDisplay(JPanel mainpanel) {
		this.mainPanel = mainPanel;
		setLayout(null);
		
		racePanel = new RacePanel();
		racePanel.setBounds(6, 72, 737, 368);
		add(racePanel);
		
		raceLeaderPanel = new RaceLeaderPanel();
		raceLeaderPanel.setBounds(261, 6, 283, 49);
		add(raceLeaderPanel);
		JButton startBtn = new JButton("START");
		
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		startBtn.setBounds(592, 16, 117, 29);
		add(startBtn);
		
	}
	
	private void raceStart() {
		racePanel.updatePlayerCoord(20);
		racePanel.updateCpuCoord(50);
	}

	

}
