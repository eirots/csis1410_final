package introScreen;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import createCar.BuildCarFrame;
import gui.MainFrame;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroPanel extends JPanel {
	private JPanel mainPanel;

	/**
	 * Create the panel.
	 */
	public IntroPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
		makeIntroPanel();
		
	}

	private void makeIntroPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{794, 0};
		gridBagLayout.rowHeights = new int[]{34, 24, 44, 42, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel titleLabel1 = new JLabel("WELCOME TO");
		titleLabel1.setFont(new Font("Monaco", Font.PLAIN, 25));
		titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_titleLabel1 = new GridBagConstraints();
		gbc_titleLabel1.anchor = GridBagConstraints.NORTH;
		gbc_titleLabel1.fill = GridBagConstraints.HORIZONTAL;
		gbc_titleLabel1.insets = new Insets(0, 0, 5, 0);
		gbc_titleLabel1.gridx = 0;
		gbc_titleLabel1.gridy = 1;
		add(titleLabel1, gbc_titleLabel1);
		
		JLabel titleLabel2 = new JLabel("DRAG RACE");
		titleLabel2.setFont(new Font("Monaco", Font.PLAIN, 60));
		GridBagConstraints gbc_titleLabel2 = new GridBagConstraints();
		gbc_titleLabel2.insets = new Insets(0, 0, 5, 0);
		gbc_titleLabel2.gridx = 0;
		gbc_titleLabel2.gridy = 2;
		add(titleLabel2, gbc_titleLabel2);
		
		JButton startButton = new JButton("start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			MainFrame main = new MainFrame();
			main.switchPanel(mainPanel, "buildCarScreen");
			//repaint();
			//revalidate();
			}
		});
		startButton.setFont(new Font("Monaco", Font.PLAIN, 25));
		GridBagConstraints gbc_startButton = new GridBagConstraints();
		gbc_startButton.anchor = GridBagConstraints.NORTH;
		gbc_startButton.gridx = 0;
		gbc_startButton.gridy = 5;
		add(startButton, gbc_startButton);
	}

}
