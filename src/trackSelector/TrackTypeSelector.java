package trackSelector;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class TrackTypeSelector extends JPanel {

	/**
	 * Create the panel.
	 */
	public TrackTypeSelector() {
		JRadioButton onRoadRadio = new JRadioButton("on-road");
		onRoadRadio.setBounds(6, 81, 84, 23);
		JRadioButton offroadRadio = new JRadioButton("offroad");
		offroadRadio.setBounds(9, 139, 78, 23);
		JRadioButton randomRadio = new JRadioButton("random");
		randomRadio.setBounds(8, 197, 80, 23);
		
		ButtonGroup group = new ButtonGroup();
		group.add(onRoadRadio);
		group.add(offroadRadio);
		group.add(randomRadio);
		setLayout(null);
		
		JLabel trackTypeLbl = new JLabel("TYPE");
		trackTypeLbl.setBounds(12, 6, 72, 40);
		trackTypeLbl.setFont(new Font("Monaco", Font.BOLD, 30));
		trackTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		add(trackTypeLbl);
		
		
		onRoadRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(onRoadRadio);
		
		
		offroadRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(offroadRadio);
		add(randomRadio);
	}

}
