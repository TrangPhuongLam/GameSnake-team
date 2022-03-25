package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.ControllerLevelView;;

public class LevelView extends JFrame {
	public JPanel panelMenu, panelGameCenter;
	public JButton btEasy, btNormal, btHard, btExit;
	private ControllerLevelView c;

	public LevelView(int width, int height) {
		
		c = new ControllerLevelView(this);

		setTitle("Level");
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set border layout
		SpringLayout layout = new SpringLayout();

		// set background game
		ImageIcon iconMenu = new ImageIcon("D:\\git\\GameSnake\\src\\data\\levelbg.png");
		panelMenu = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(iconMenu.getImage(), 0, 0, getWidth(), getHeight(), null);
			}
		};
		setContentPane(panelMenu);

		// set GridLayout
		panelGameCenter = new JPanel();
		panelGameCenter.setLayout(new GridLayout(6, 1));
		panelGameCenter.setPreferredSize(new Dimension(102, 300));

		// create button play, hidden background button Easy and event button Easy

		ImageIcon iconEasy = new ImageIcon("D:\\git\\GameSnake\\src\\data\\easy.png");
		btEasy = new JButton(iconEasy);
		btEasy.setBorderPainted(false);
		btEasy.setContentAreaFilled(false);
		btEasy.setFocusable(false);
		btEasy.setPreferredSize(new Dimension(87, 35));
		btEasy.addMouseListener(c);

		// create button Normal, hidden background button Normal and event button Normal

		ImageIcon iconNormal = new ImageIcon("D:\\git\\GameSnake\\src\\data\\normal.png");
		btNormal = new JButton(iconNormal);
		btNormal.setBorderPainted(false);
		btNormal.setContentAreaFilled(false);
		btNormal.setFocusable(false);
		btNormal.setPreferredSize(new Dimension(87, 35));
		btNormal.addMouseListener(c);

		// create button Hard, hidden background button hard and event button Hard

		ImageIcon iconHard = new ImageIcon("D:\\git\\GameSnake\\src\\data\\hard.png");
		btHard = new JButton(iconHard);
		btHard.setBorderPainted(false);
		btHard.setContentAreaFilled(false);
		btHard.setFocusable(false);
		btHard.setPreferredSize(new Dimension(87, 35));
		btHard.addMouseListener(c);

		// create button Exit...

		ImageIcon iconExit = new ImageIcon("D:\\git\\GameSnake\\src\\data\\exit.png");
		btExit = new JButton(iconExit);
		btExit.setBorderPainted(false);
		btExit.setContentAreaFilled(false);
		btExit.setFocusable(false);
		btExit.setPreferredSize(new Dimension(87, 35));
		btExit.addMouseListener(c);

		// no bug for hidden background button

		panelGameCenter.setOpaque(false);

		// add button to the panel

		panelGameCenter.add(btEasy);
		panelGameCenter.add(btNormal);
		panelGameCenter.add(btHard);
		panelGameCenter.add(btExit);

		layout.putConstraint(SpringLayout.NORTH, panelGameCenter, 65, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, panelGameCenter, 90, SpringLayout.WEST, this);
		setLayout(layout);
		add(panelGameCenter);
		setVisible(true);
		setResizable(false);
	}

}
