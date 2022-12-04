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
		shortRadio.setBounds(27, 81, 65, 23);
		JRadioButton mediumRadio = new JRadioButton("medium");
		mediumRadio.setBounds(18, 139, 83, 23);
		JRadioButton longRadio = new JRadioButton("long");
		longRadio.setBounds(30, 197, 60, 23);
		
		ButtonGroup group = new ButtonGroup();
		group.add(shortRadio);
		group.add(mediumRadio);
		group.add(longRadio);
		setLayout(null);
		
		JLabel lengthLbl = new JLabel("LENGTH");
		lengthLbl.setBounds(6, 6, 108, 40);
		lengthLbl.setFont(new Font("Monaco", Font.BOLD, 30));
		lengthLbl.setHorizontalAlignment(SwingConstants.CENTER);
		add(lengthLbl);
		
		
		shortRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(shortRadio);
		
		
		mediumRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(mediumRadio);
		add(longRadio);
		
	}

}
