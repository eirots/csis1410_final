package createCar;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Insets;
import java.awt.Font;

public class EnginePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public EnginePanel() {
		
		JRadioButton vEngineRadio = new JRadioButton("V engine");
		JRadioButton inlineRadio = new JRadioButton("inline");
		JRadioButton boxerRadio = new JRadioButton("opposed");
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(vEngineRadio);
		group.add(inlineRadio);
		group.add(boxerRadio);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel engineLabel = new JLabel("ENGINE");
		engineLabel.setFont(new Font("Monaco", Font.BOLD, 30));
		engineLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_engineLabel = new GridBagConstraints();
		gbc_engineLabel.insets = new Insets(0, 0, 5, 5);
		gbc_engineLabel.gridx = 3;
		gbc_engineLabel.gridy = 1;
		add(engineLabel, gbc_engineLabel);
		
		
		
		vEngineRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_vEngineRadio = new GridBagConstraints();
		gbc_vEngineRadio.insets = new Insets(0, 0, 5, 5);
		gbc_vEngineRadio.gridx = 3;
		gbc_vEngineRadio.gridy = 3;
		add(vEngineRadio, gbc_vEngineRadio);
		
		
		inlineRadio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_inlineRadio = new GridBagConstraints();
		gbc_inlineRadio.insets = new Insets(0, 0, 5, 5);
		gbc_inlineRadio.gridx = 3;
		gbc_inlineRadio.gridy = 5;
		add(inlineRadio, gbc_inlineRadio);
		
		
		GridBagConstraints gbc_boxerRadio = new GridBagConstraints();
		gbc_boxerRadio.insets = new Insets(0, 0, 0, 5);
		gbc_boxerRadio.gridx = 3;
		gbc_boxerRadio.gridy = 7;
		add(boxerRadio, gbc_boxerRadio);

	}

}
