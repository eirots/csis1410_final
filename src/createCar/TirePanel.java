package createCar;

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
		JRadioButton allTerrainRadio = new JRadioButton("all terrain");
		JRadioButton lowProfileRadio = new JRadioButton("low profile");
		JRadioButton offroadTiresRadio = new JRadioButton("off road");
		
		ButtonGroup group = new ButtonGroup();
		group.add(offroadTiresRadio);
		group.add(allTerrainRadio);
		group.add(lowProfileRadio);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel tireLabel = new JLabel("TIRES");
		tireLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		tireLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tireLabel = new GridBagConstraints();
		gbc_tireLabel.insets = new Insets(0, 0, 5, 5);
		gbc_tireLabel.gridx = 3;
		gbc_tireLabel.gridy = 1;
		add(tireLabel, gbc_tireLabel);
		
		
		
		
		lowProfileRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lowProfileRadio = new GridBagConstraints();
		gbc_lowProfileRadio.insets = new Insets(0, 0, 5, 5);
		gbc_lowProfileRadio.gridx = 3;
		gbc_lowProfileRadio.gridy = 3;
		add(lowProfileRadio, gbc_lowProfileRadio);
		
		
		allTerrainRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_allTerrainRadio = new GridBagConstraints();
		gbc_allTerrainRadio.insets = new Insets(0, 0, 5, 5);
		gbc_allTerrainRadio.gridx = 3;
		gbc_allTerrainRadio.gridy = 5;
		add(allTerrainRadio, gbc_allTerrainRadio);
		
		
		GridBagConstraints gbc_offroadTiresRadio = new GridBagConstraints();
		gbc_offroadTiresRadio.insets = new Insets(0, 0, 0, 5);
		gbc_offroadTiresRadio.gridx = 3;
		gbc_offroadTiresRadio.gridy = 7;
		add(offroadTiresRadio, gbc_offroadTiresRadio);

	}

}
