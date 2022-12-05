package createCarGui;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class TirePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TirePanel() {
		
		ButtonGroup group = new ButtonGroup();
		setLayout(null);
		
		JLabel tireLabel = new JLabel("TIRES");
		tireLabel.setBounds(15, 6, 90, 40);
		tireLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		tireLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tireLabel);
		JRadioButton lowProfileRadio = new JRadioButton("low profile");
		lowProfileRadio.setBounds(6, 75, 99, 23);
		group.add(lowProfileRadio);
		
		
		
		
		lowProfileRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lowProfileRadio);
		JRadioButton allTerrainRadio = new JRadioButton("all terrain");
		allTerrainRadio.setBounds(9, 133, 92, 23);
		group.add(allTerrainRadio);
		
		
		allTerrainRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		add(allTerrainRadio);
		JRadioButton offroadTiresRadio = new JRadioButton("off road");
		offroadTiresRadio.setBounds(14, 191, 82, 23);
		offroadTiresRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		group.add(offroadTiresRadio);
		add(offroadTiresRadio);

	}

}
