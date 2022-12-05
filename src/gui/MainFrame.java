package gui;

import java.awt.EventQueue;
import java.util.Random;

import javax.sound.midi.Track;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import car.Body;
import car.Car;
import car.Engine;
import car.EngineBlock;
import car.Frame;
import car.TireType;
import car.Tires;
import createCarGui.BuildCarFrame;
import introScreenGui.IntroPanel;
import trackSelectionGui.TrackSelector;

import java.awt.CardLayout;
import java.awt.Container;

public class MainFrame extends JFrame {

	public JPanel mainPanel;
	public JPanel cards;
	public static Car playerCar;
	public static Car cpuCar;
	public static Track track;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					new MainFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		mainPanel = new JPanel();
		mainPanel.setLayout(new CardLayout());
		// TURN OFF RESIZING

		// add new panels here
		mainPanel.add(new IntroPanel(mainPanel), "intro");
		mainPanel.add(new BuildCarFrame(mainPanel), "buildCarScreen");
		mainPanel.add(new TrackSelector(mainPanel), "trackSelector");

		setContentPane(mainPanel);

	}

	public static void setPlayerCar(Car car) {
		playerCar = car;
	}

	public static void printPlayerCar() {
		System.out.println(playerCar.toString());
	}

	public void switchPanel(Container container, String panelName) {
		CardLayout card = (CardLayout) (container.getLayout());
		card.show(container, panelName);

	}

	public void makeCpuCar() {
		cpuCar = new Car(new Body(randomEnum(Frame.class)), new Engine(randomEnum(EngineBlock.class)),
				new Tires(randomEnum(TireType.class)));
	}

	public Car getPlayerCar() {
		return playerCar;
	}

	public Car getCpuCar() {
		return cpuCar;
	}

	public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		Random random = new Random();
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}

}
