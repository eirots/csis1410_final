package raceGui;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

import car.Body;
import car.Car;
import car.Engine;
import car.EngineBlock;
import car.Frame;
import car.TireType;
import car.Tires;
import gui.MainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RaceDisplay extends JPanel {
	private JPanel mainPanel;
	private RacePanel racePanel;
	private RaceLeaderPanel raceLeaderPanel;
	private JButton startBtn;

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
		raceLeaderPanel.setBounds(97, 6, 497, 49);
		add(raceLeaderPanel);
		startBtn = new JButton("START");

		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startBtn.setVisible(false);
				System.out.println(MainFrame.track.getTrackType());
				rev();

				while (!(racePanel.getPlayerX() > 620) || !(racePanel.getCpuX() > 620)) {
					race();
				}
				if(racePanel.getPlayerX() < racePanel.getCpuX()) {
					raceLeaderPanel.updateLeaderLabel("WINNER: CPU");
				}else {
					raceLeaderPanel.updateLeaderLabel("WINNER: PLAYER");
				}

			}
		});
		startBtn.setBounds(592, 16, 117, 29);
		add(startBtn);

	}

	private void race() {
		
		System.out.println("Playerspd "+ calcCarSpeed(MainFrame.playerCar));
		racePanel.updatePlayerCoord(calcCarSpeed(MainFrame.playerCar));
		System.out.println("cpuSpd "+calcCarSpeed( MainFrame.cpuCar));
		racePanel.updateCpuCoord(calcCarSpeed(MainFrame.cpuCar));

	}

	private int calcCarSpeed(Car car) {
		int carSpeed;
		try {
			carSpeed = (int) Math.floor(20 * car.calculateCurrentSpeed(car.getCurrentSpeed(), MainFrame.track.getTrackType()));
			if (carSpeed < 0) {
				carSpeed = carSpeed * -1;
			}
			return carSpeed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	private void rev() {
		try {
			MainFrame.playerCar.calculateCurrentSpeed(0, MainFrame.track.getTrackType());
		} catch (Exception e) {
			e.printStackTrace();
			throw new NullPointerException("YOU BLEW IT");
		}
		try {
			MainFrame.cpuCar.calculateCurrentSpeed(0, MainFrame.track.getTrackType());
		} catch (Exception e) {
			e.printStackTrace();
			throw new NullPointerException("YOU BROKE IT");
		}

	}

}
