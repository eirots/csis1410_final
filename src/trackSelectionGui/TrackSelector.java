package trackSelectionGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import car.Car;
import car.TireType;
import gui.MainFrame;
import track.Track;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrackSelector extends JPanel {
	private JPanel mainPanel;
	private LengthSelection lengthSelectPanel;
	private TrackTypeSelector trackTypePanel;

	/**
	 * Create the panel.
	 */
	public TrackSelector(JPanel mainPanel) {
		this.mainPanel = mainPanel;

		makeTrackSelector();

	}

	private void makeTrackSelector() {
		setLayout(null);

		JLabel trackSelectLbl = new JLabel("SELECT TRACK");
		trackSelectLbl.setHorizontalAlignment(SwingConstants.CENTER);
		trackSelectLbl.setFont(new Font("Monaco", Font.PLAIN, 40));
		trackSelectLbl.setBounds(159, 6, 463, 74);
		add(trackSelectLbl);

		lengthSelectPanel = new LengthSelection();
		lengthSelectPanel.setBounds(190, 92, 125, 242);
		add(lengthSelectPanel);

		trackTypePanel = new TrackTypeSelector();
		trackTypePanel.setBounds(438, 92, 101, 242);
		add(trackTypePanel);

		JButton trackSelectorBtn = new JButton("continue");

		trackSelectorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Track genTrack = null;
				if (trackLengthSwitch(lengthSelectPanel.getSelectedRadio()) > 0) {
					// tracks take length and track type
					try {
						genTrack = new Track(trackLengthSwitch(lengthSelectPanel.getSelectedRadio()),
								trackTypeSwitch(trackTypePanel.getSelectedRadio()));
					} catch (Exception e1) {
						e1.printStackTrace();
					}

				} else {
					try {
						genTrack = new Track(trackTypeSwitch(trackTypePanel.getSelectedRadio()));
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

				if (genTrack != null) {
					MainFrame.setTrack(genTrack);
				} else {
					throw new NullPointerException("SOMEHOW YOU MANAGED TO MAKE A NULL TRACK");
				}

			}
		});
		trackSelectorBtn.setBounds(326, 340, 117, 29);
		add(trackSelectorBtn);
	}

	private int trackLengthSwitch(String str) {
		switch (str) {
		case "short":
			return 300;
		case "long":
			return 600;
		case "random":
			return 0;
		default:
			throw new NullPointerException("NO LENGTH WAS SELECTED");
		}
	}

	private String trackTypeSwitch(String str) {
		switch (str) {
		case "onroad":
			return "OnRoad";
		case "offroad":
			return "OffRoad";
		case "random":
			if (Math.random() < .5) {
				return "OnRoad";
			} else {
				return "OffRoad";
			}
		default:
			throw new NullPointerException("NO TYPE WAS SELECTED");
		}
	}

}
