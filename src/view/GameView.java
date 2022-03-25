package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.ControllerGameView;

public class GameView extends JFrame implements Runnable {
	Thread thread;
	public JLabel labelScore;
	public JLabel labelMaxScore;
	private ControllerGameView controller;
	public ScreenGame screenGame;

//	private MenuGame menu;

	public GameView(int width, int height) {
		
		controller = new ControllerGameView(this);
		screenGame = new ScreenGame();
		// labelScore = new JLabel(score.getScore()+"");
		setTitle("Game Snake");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setResizable(false);
		this.addKeyListener(new handler());
		paintFrame(width, height);

		thread = new Thread(this);
		thread.start();
	}

	public void paintFrame(int width, int height) {

		this.setLayout(new BorderLayout());

		JPanel panelNorth = new JPanel();

		SpringLayout layoutN = new SpringLayout();
		panelNorth.setLayout(layoutN);
		panelNorth.setPreferredSize(new Dimension(width, height / 13));
		panelNorth.setBackground(new Color(0, 139, 69));

		labelScore = new JLabel("0");
		labelScore.setFont(labelScore.getFont().deriveFont(15.0f));
		labelScore.setForeground(Color.WHITE);

		labelMaxScore = new JLabel("0");
		labelMaxScore.setFont(labelMaxScore.getFont().deriveFont(15.0f));
		labelMaxScore.setForeground(Color.WHITE);

		ImageIcon iconApple = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Apple.png");
		JLabel labelApple = new JLabel();
		labelApple.setIcon(iconApple);

		ImageIcon iconCup = new ImageIcon("D:\\git\\GameSnake\\src\\data\\cup.png");
		JLabel labelCup = new JLabel();
		labelCup.setIcon(iconCup);

//		ImageIcon iconVolume = new ImageIcon("D:\\git\\GameSnake\\src\\data\\volume.png");
//		JButton btVolume = new JButton(iconVolume);
//		btVolume.setPreferredSize(new Dimension(20, 16));
//		btVolume.setBackground(new Color(0, 139, 69));
//		btVolume.setBorderPainted(false);

		panelNorth.add(labelApple);
		panelNorth.add(labelScore);
		panelNorth.add(labelCup);
		panelNorth.add(labelMaxScore);
		// panelNorth.add(btVolume);

		layoutN.putConstraint(SpringLayout.WEST, labelApple, 5, SpringLayout.WEST, panelNorth);
		layoutN.putConstraint(SpringLayout.NORTH, labelApple, 5, SpringLayout.NORTH, panelNorth);
		layoutN.putConstraint(SpringLayout.WEST, labelScore, 30, SpringLayout.WEST, panelNorth);
		layoutN.putConstraint(SpringLayout.NORTH, labelScore, 10, SpringLayout.NORTH, panelNorth);
		layoutN.putConstraint(SpringLayout.WEST, labelCup, 100, SpringLayout.WEST, panelNorth);
		layoutN.putConstraint(SpringLayout.NORTH, labelCup, 5, SpringLayout.NORTH, panelNorth);
		layoutN.putConstraint(SpringLayout.WEST, labelMaxScore, 130, SpringLayout.WEST, panelNorth);
		layoutN.putConstraint(SpringLayout.NORTH, labelMaxScore, 10, SpringLayout.NORTH, panelNorth);
//		layoutN.putConstraint(SpringLayout.NORTH, btVolume, 12, SpringLayout.NORTH, panelNorth);
//		layoutN.putConstraint(SpringLayout.WEST, btVolume, 430, SpringLayout.WEST, panelNorth);

		add(panelNorth, BorderLayout.NORTH);
		add(screenGame, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		GameView gameFrame = new GameView(413, 472);

	}

	public class handler implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		controller.handlerKeyPress(e);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public void run() {
		while (true) {
			controller.handlerScore();
			try {
				thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

		}
	}

}
