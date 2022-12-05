package createCarGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import gui.MainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BuildCarFrame extends JPanel {
	private JPanel mainPanel;

	/**
	 * Create the panel.
	 */
	public BuildCarFrame(JPanel mainPanel) {
		this.mainPanel = mainPanel;
		buildCarFrame();
		
				
	}

	private void buildCarFrame() {
		setLayout(null);
		
		JLabel carScreenLabel = new JLabel("BUILD YOUR CAR");
		carScreenLabel.setBounds(180, 0, 463, 74);
		carScreenLabel.setHorizontalAlignment(SwingConstants.CENTER);
		carScreenLabel.setFont(new Font("Monaco", Font.PLAIN, 40));
		

		JButton saveButton = new JButton("save");
		JButton loadButton = new JButton("load");
		
		add(carScreenLabel);
		
		JPanel enginePanel = new EnginePanel();
		enginePanel.setBounds(214, 68, 125, 274);
		add(enginePanel);
		
		JPanel tirePanel = new TirePanel();
		tirePanel.setBounds(54, 68, 114, 222);
		add(tirePanel);
		
		saveButton.setBounds(536, 356, 257, 90);
		add(saveButton);
		
		JPanel bodyPanel = new BodyPanel();
		bodyPanel.setBounds(387, 68, 125, 169);
		add(bodyPanel);
		
		
		loadButton.setBounds(536, 291, 260, 74);
		add(loadButton);
		
		JButton createCarButton = new JButton("continue");
		createCarButton.setBounds(1, 371, 448, 69);
		createCarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame main = new MainFrame();
				
				
				main.switchPanel(mainPanel, "trackSelector");
			}
		});
		add(createCarButton);
	}

}
