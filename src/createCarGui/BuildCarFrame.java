package createCarGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import car.Body;
import car.Car;
import car.Engine;
import car.EngineBlock;
import car.Frame;
import car.TireType;
import car.Tires;
import gui.MainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;

public class BuildCarFrame extends JPanel {
	private JPanel mainPanel;
	private BodyPanel bodyPanel;
	private TirePanel tirePanel;
	private EnginePanel enginePanel;
	private boolean isLoaded;
	private JComboBox<Integer> comboBox;

	/**
	 * Create the panel.
	 */
	public BuildCarFrame(JPanel mainPanel) {
		isLoaded = false;
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
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Car playerCar = new Car(
						new Body(switchFrame(bodyPanel.getSelectedRadio())),
						new Engine(switchEngine(enginePanel.getSelectedRadio())),
						new Tires(switchTire(tirePanel.getSelectedRadio())));
				Car.saveCar(playerCar, new File("src/finalProject_1410/SavedCars.txt"));
			}
		});
		JButton loadButton = new JButton("load");
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.playerCar = Car.loadCar(new File("src/finalProject_1410/SavedCars.txt"), (int) comboBox.getSelectedItem());
				System.out.println(MainFrame.playerCar);
				isLoaded = true;
			}
		});
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

				// body, engine, tires
				if(!isLoaded) {
					Car playerCar = new Car(
							new Body(switchFrame(bodyPanel.getSelectedRadio())),
							new Engine(switchEngine(enginePanel.getSelectedRadio())),
							new Tires(switchTire(tirePanel.getSelectedRadio())));
					MainFrame.setPlayerCar(playerCar);
				}
				MainFrame.printPlayerCar();
				main.switchPanel(mainPanel, "trackSelector");
			}
		});
		add(createCarButton);
		
		comboBox = new JComboBox<>();
		for(int i = 1; i<8; i++) {
			comboBox.addItem(i);
		}
		comboBox.setBounds(536, 237, 252, 27);
		add(comboBox);
	}

	private Frame switchFrame(String frame) {
		switch (frame) {
		case "sport":
			return Frame.SPORTSCAR;
		case "offroad":
			return Frame.OFFROAD;
		default:
			throw new NullPointerException("NO FRAME WAS SELECTED");
		}

	}

	private EngineBlock switchEngine(String engine) {
		switch (engine) {
		case "vengine":
			return EngineBlock.VEngine;
		case "inline":
			return EngineBlock.InlineEngine;
		case "opposed":
			return EngineBlock.OpposedEngine;
		default:
			throw new NullPointerException("NO ENGINE WAS SELECTED");
		}
	}

	private TireType switchTire(String tire) {
		switch (tire) {
		case "low profile":
			return TireType.LOWPROFILE;
		case "allterrain":
			return TireType.ALL_TERRAIN;
		case "offroad":
			return TireType.OFFROAD;
		default:
			throw new NullPointerException("NO TIRE TYPE WAS SELECTED");
		}
	}
}
