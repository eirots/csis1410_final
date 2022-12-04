package createCar;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class BodyPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BodyPanel() {

		JRadioButton offroadBodyRadio = new JRadioButton("offroad");
		JRadioButton sportRadio = new JRadioButton("sport");

		ButtonGroup group = new ButtonGroup();
		group.add(offroadBodyRadio);
		group.add(sportRadio);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel bodyLabel = new JLabel("BODY");

		bodyLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		bodyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_bodyLabel = new GridBagConstraints();
		gbc_bodyLabel.insets = new Insets(0, 0, 5, 5);
		gbc_bodyLabel.gridx = 2;
		gbc_bodyLabel.gridy = 3;
		add(bodyLabel, gbc_bodyLabel);

		sportRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_sportRadio = new GridBagConstraints();
		gbc_sportRadio.insets = new Insets(0, 0, 5, 5);
		gbc_sportRadio.gridx = 2;
		gbc_sportRadio.gridy = 5;
		add(sportRadio, gbc_sportRadio);

		offroadBodyRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_offroadBodyRadio = new GridBagConstraints();
		gbc_offroadBodyRadio.insets = new Insets(0, 0, 5, 5);
		gbc_offroadBodyRadio.gridx = 2;
		gbc_offroadBodyRadio.gridy = 7;
		add(offroadBodyRadio, gbc_offroadBodyRadio);

	}

}