package createCarGui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import car.EngineBlock;

import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Insets;
import java.awt.Font;

public class EnginePanel extends JPanel {

	private ButtonGroup group;
	/**
	 * Create the panel.
	 */
	public EnginePanel() {
		
		JRadioButton vEngineRadio = new JRadioButton("V engine");
		vEngineRadio.setBounds(17, 81, 86, 23);
		vEngineRadio.setActionCommand("vengine");
		vEngineRadio.setSelected(true);
		
		JRadioButton inlineRadio = new JRadioButton("inline");
		inlineRadio.setBounds(26, 139, 67, 23);
		inlineRadio.setActionCommand("inline");
		JRadioButton boxerRadio = new JRadioButton("opposed");
		boxerRadio.setBounds(17, 197, 86, 23);
		boxerRadio.setActionCommand("opposed");
		
		group = new ButtonGroup();
		
		group.add(vEngineRadio);
		group.add(inlineRadio);
		group.add(boxerRadio);
		setLayout(null);
		
		JLabel engineLabel = new JLabel("ENGINE");
		engineLabel.setBounds(6, 6, 108, 40);
		engineLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		engineLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(engineLabel);
		
		
		
		vEngineRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(vEngineRadio);
		
		
		inlineRadio.setHorizontalAlignment(SwingConstants.LEFT);
		add(inlineRadio);
		add(boxerRadio);

	}
	public String getSelectedRadio() {
		System.out.println("engine " + group.getSelection().getActionCommand());
		return group.getSelection().getActionCommand();
	}

}
