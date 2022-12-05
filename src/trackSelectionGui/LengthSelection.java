package trackSelectionGui;

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

	private ButtonGroup group;
	/**
	 * Create the panel.
	 */
	public LengthSelection() {
		JRadioButton shortRadio = new JRadioButton("short");
		shortRadio.setBounds(27, 82, 65, 23);
		shortRadio.setActionCommand("short");
		JRadioButton mediumRadio = new JRadioButton("long");
		mediumRadio.setBounds(27, 141, 83, 23);
		mediumRadio.setActionCommand("long");
		JRadioButton longRadio = new JRadioButton("random");
		longRadio.setBounds(27, 198, 99, 23);
		longRadio.setActionCommand("random");
		
		group = new ButtonGroup();
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
	public String getSelectedRadio() {
		System.out.println("length: "+ group.getSelection().getActionCommand());
		return group.getSelection().getActionCommand();
	}

}
