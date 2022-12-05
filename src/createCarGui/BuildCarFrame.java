package createCarGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import car.EngineBlock;
import car.Frame;
import car.TireType;
import gui.MainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuildCarFrame extends JPanel {
	private JPanel mainPanel;
	private BodyPanel bodyPanel;
	private TirePanel tirePanel;
	private EnginePanel enginePanel;

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
		JButton createCarButton = new JButton("continue");

		

		enginePanel = new EnginePanel();
		bodyPanel = new BodyPanel();
		tirePanel = new TirePanel();

		enginePanel.setBounds(214, 68, 125, 274);
		tirePanel.setBounds(54, 68, 114, 222);
		bodyPanel.setBounds(387, 68, 125, 169);
		createCarButton.setBounds(1, 371, 448, 69);

		saveButton.setBounds(536, 356, 257, 90);
		loadButton.setBounds(536, 291, 260, 74);

		add(carScreenLabel);
		add(bodyPanel);
		add(tirePanel);
		add(enginePanel);
		add(saveButton);
		add(loadButton);

		
		
		createCarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame main = new MainFrame();
				
				Car playerCar = new Car(
						);
				bodyPanel.getSelectedRadio();
				enginePanel.getSelectedRadio();
				tirePanel.getSelectedRadio();
				main.switchPanel(mainPanel, "trackSelector");
			}
		});
		add(createCarButton);
	}

	private Frame switchFrame(String frame) {
		switch(frame) {
		case "sport":
			return Frame.SPORTSCAR;
		case "offroad":
			return Frame.OFFROAD;
		
		}
		
	}

	private EngineBlock switchEngine(String engine) {

	}

	private TireType switchTire(String tire) {

	}

}
