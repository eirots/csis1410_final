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
		JRadioButton offroadRadio = new JRadioButton("offroad");
		JRadioButton randomRadio = new JRadioButton("random");
		
		ButtonGroup group = new ButtonGroup();
		group.add(onRoadRadio);
		group.add(offroadRadio);
		group.add(randomRadio);
		
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel trackTypeLbl = new JLabel("TYPE");
		trackTypeLbl.setFont(new Font("Monaco", Font.BOLD, 30));
		trackTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_trackTypeLbl = new GridBagConstraints();
		gbc_trackTypeLbl.insets = new Insets(0, 0, 5, 5);
		gbc_trackTypeLbl.gridx = 3;
		gbc_trackTypeLbl.gridy = 1;
		add(trackTypeLbl, gbc_trackTypeLbl);
		
		
		onRoadRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_onRoadRadio = new GridBagConstraints();
		gbc_onRoadRadio.insets = new Insets(0, 0, 5, 5);
		gbc_onRoadRadio.gridx = 3;
		gbc_onRoadRadio.gridy = 3;
		add(onRoadRadio, gbc_onRoadRadio);
		
		
		offroadRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_offroadRadio = new GridBagConstraints();
		gbc_offroadRadio.insets = new Insets(0, 0, 5, 5);
		gbc_offroadRadio.gridx = 3;
		gbc_offroadRadio.gridy = 5;
		add(offroadRadio, gbc_offroadRadio);
		
		
		GridBagConstraints gbc_randomRadio = new GridBagConstraints();
		gbc_randomRadio.insets = new Insets(0, 0, 0, 5);
		gbc_randomRadio.gridx = 3;
		gbc_randomRadio.gridy = 7;
		add(randomRadio, gbc_randomRadio);
	}

}
