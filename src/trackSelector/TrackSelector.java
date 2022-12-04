package trackSelector;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrackSelector extends JPanel {
	private JPanel mainPanel;

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
		
		LengthSelection lengthSelectPanel = new LengthSelection();
		lengthSelectPanel.setBounds(68, 65, 245, 255);
		add(lengthSelectPanel);
		
		TrackTypeSelector trackTypePanel = new TrackTypeSelector();
		trackTypePanel.setBounds(458, 65, 251, 255);
		add(trackTypePanel);
		
		JButton trackSelectorBtn = new JButton("continue");
		trackSelectorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		trackSelectorBtn.setBounds(326, 340, 117, 29);
		add(trackSelectorBtn);
	}
}
