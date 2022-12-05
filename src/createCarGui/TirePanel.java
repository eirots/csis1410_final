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

	private ButtonGroup group;
	/**
	 * Create the panel.
	 */
	public TirePanel() {
		
		group = new ButtonGroup();
		setLayout(null);
		
		JLabel tireLabel = new JLabel("TIRES");
		tireLabel.setBounds(15, 6, 90, 40);
		tireLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		tireLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tireLabel);
		JRadioButton lowProfileRadio = new JRadioButton("low profile");
		lowProfileRadio.setActionCommand("low profile");
		lowProfileRadio.setBounds(6, 75, 99, 23);
		group.add(lowProfileRadio);
		
		
		
		
		lowProfileRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lowProfileRadio);
		JRadioButton allTerrainRadio = new JRadioButton("all terrain");
		allTerrainRadio.setBounds(9, 133, 92, 23);
		allTerrainRadio.setActionCommand("allterrain");
		group.add(allTerrainRadio);
		
		
		allTerrainRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		add(allTerrainRadio);
		JRadioButton offroadTiresRadio = new JRadioButton("off road");
		offroadTiresRadio.setBounds(14, 191, 82, 23);
		offroadTiresRadio.setActionCommand("offroad");
		offroadTiresRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		group.add(offroadTiresRadio);
		add(offroadTiresRadio);

	}
		public String getSelectedRadio() {
		System.out.println(group.getSelection().getActionCommand());
		return group.getSelection().getActionCommand();
	}

}
