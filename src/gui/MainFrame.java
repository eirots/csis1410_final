package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import car.Car;
import createCarGui.BuildCarFrame;
import introScreenGui.IntroPanel;
import trackSelectionGui.TrackSelector;

import java.awt.CardLayout;
import java.awt.Container;

public class MainFrame extends JFrame {

	public JPanel mainPanel;
	public JPanel cards;
	public static Car playerCar;


	

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
		
		
		//add new panels here 
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
		CardLayout card = (CardLayout)(container.getLayout());
		card.show(container, panelName);
		
		
		
	}

}

