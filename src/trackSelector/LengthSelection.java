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

public class LengthSelection extends JPanel {

	/**
	 * Create the panel.
	 */
	public LengthSelection() {
		JRadioButton shortRadio = new JRadioButton("short");
		JRadioButton mediumRadio = new JRadioButton("medium");
		JRadioButton longRadio = new JRadioButton("long");
		
		ButtonGroup group = new ButtonGroup();
		group.add(shortRadio);
		group.add(mediumRadio);
		group.add(longRadio);
		
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lengthLbl = new JLabel("LENGTH");
		lengthLbl.setFont(new Font("Monaco", Font.BOLD, 30));
		lengthLbl.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lengthLbl = new GridBagConstraints();
		gbc_lengthLbl.insets = new Insets(0, 0, 5, 5);
		gbc_lengthLbl.gridx = 3;
		gbc_lengthLbl.gridy = 1;
		add(lengthLbl, gbc_lengthLbl);
		
		
		shortRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_shortRadio = new GridBagConstraints();
		gbc_shortRadio.insets = new Insets(0, 0, 5, 5);
		gbc_shortRadio.gridx = 3;
		gbc_shortRadio.gridy = 3;
		add(shortRadio, gbc_shortRadio);
		
		
		mediumRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_mediumRadio = new GridBagConstraints();
		gbc_mediumRadio.insets = new Insets(0, 0, 5, 5);
		gbc_mediumRadio.gridx = 3;
		gbc_mediumRadio.gridy = 5;
		add(mediumRadio, gbc_mediumRadio);
		
		
		GridBagConstraints gbc_longRadio = new GridBagConstraints();
		gbc_longRadio.insets = new Insets(0, 0, 0, 5);
		gbc_longRadio.gridx = 3;
		gbc_longRadio.gridy = 7;
		add(longRadio, gbc_longRadio);
		
	}

}
