package createCarGui;

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

	private ButtonGroup group;

	/**
	 * Create the panel.
	 */
	public BodyPanel() {

		JRadioButton offroadBodyRadio = new JRadioButton("offroad");
		offroadBodyRadio.setBounds(6, 139, 78, 23);
		JRadioButton sportRadio = new JRadioButton("sport");
		sportRadio.setBounds(12, 81, 65, 23);

		group = new ButtonGroup();
		group.add(offroadBodyRadio);
		group.add(sportRadio);
		setLayout(null);

		JLabel bodyLabel = new JLabel("BODY");
		bodyLabel.setBounds(12, 6, 72, 40);

		bodyLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		bodyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(bodyLabel);

		sportRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(sportRadio);

		offroadBodyRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(offroadBodyRadio);

	}

}