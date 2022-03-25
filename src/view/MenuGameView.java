package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Controller;
import controller.GameController;
import model.Sound;

public class MenuGameView extends JFrame {

	Controller controller;
	public JPanel panelMenu, panelGameCenter;
	public JButton btPlay, btLevel, btScore, btOption, btHelp, btExit;
	// public static Game game;

	public MenuGameView(int width, int height) {
		Sound.playSound("D:\\git\\GameSnake\\src\\data\\sound.wav");
		setTitle("Menu Game");
		controller = new GameController(this);
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		ImageIcon iconMenu = new ImageIcon("D:\\git\\GameSnake\\src\\data\\screenBG.png");

		panelMenu = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(iconMenu.getImage(), 0, 0, getWidth(), getHeight(), null);
			}
		};
		setContentPane(panelMenu);

		// set Gridlayout.
		panelGameCenter = new JPanel();
		panelGameCenter.setLayout(new GridLayout(6, 1));
		panelGameCenter.setPreferredSize(new Dimension(102, 300));

		ImageIcon iconPlay = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Play.png");
		btPlay = new JButton(iconPlay);
		btPlay.setBorderPainted(false);
		btPlay.setContentAreaFilled(false);
		btPlay.setFocusable(false);
		btPlay.setPreferredSize(new Dimension(87, 35));
		btPlay.addMouseListener(controller);

		ImageIcon iconLevel = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Level.png");
		btLevel = new JButton(iconLevel);
		btLevel.setBorderPainted(false);
		btLevel.setContentAreaFilled(false);
		btLevel.setFocusable(false);
		btLevel.setPreferredSize(new Dimension(87, 35));
		btLevel.addMouseListener(controller);

		ImageIcon iconScore = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Score.png");
		btScore = new JButton(iconScore);
		btScore.setBorderPainted(false);
		btScore.setContentAreaFilled(false);
		btScore.setFocusable(false);
		btScore.setPreferredSize(new Dimension(87, 35));
		btScore.addMouseListener(controller);

//		ImageIcon iconOption = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Options.png");
//		btOption = new JButton(iconOption);
//		btOption.setBorderPainted(false);
//		btOption.setContentAreaFilled(false);
//		btOption.setFocusable(false);
//		btOption.setPreferredSize(new Dimension(87,35));
//		btOption.addMouseListener(controller);
//		
		ImageIcon iconHelp = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Help.png");
		btHelp = new JButton(iconHelp);
		btHelp.setBorderPainted(false);
		btHelp.setContentAreaFilled(false);
		btHelp.setFocusable(false);
		btHelp.setPreferredSize(new Dimension(87, 35));
		btHelp.addMouseListener(controller);

		ImageIcon iconExit = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Exit.png");
		btExit = new JButton(iconExit);
		btExit.setBorderPainted(false);
		btExit.setContentAreaFilled(false);
		btExit.setFocusable(false);
		btExit.setPreferredSize(new Dimension(87, 35));
		btExit.addMouseListener(controller);

		panelGameCenter.setOpaque(false);

		panelGameCenter.add(btPlay);
		panelGameCenter.add(btLevel);
		panelGameCenter.add(btScore);
		// panelGameCenter.add(btOption);
		panelGameCenter.add(btHelp);
		panelGameCenter.add(btExit);

		add(panelGameCenter, BorderLayout.CENTER);
		setVisible(true);

	}
}
