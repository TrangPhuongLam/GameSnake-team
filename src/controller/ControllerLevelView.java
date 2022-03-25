package controller;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import model.Level;
import model.Sound;
import view.GameView;
import view.LevelView;
import view.MenuGameView;

public class ControllerLevelView implements MouseListener {

	private Level level;
	private LevelView l;

	public ControllerLevelView(LevelView l) {
		this.l = l;
		level = new Level();
	}

	public void mouseClicked(MouseEvent e) {
		Sound.playSound("D:\\git\\GameSnake\\src\\data\\pop.wav");
		if (e.getSource() == l.btEasy) {
			level.setNumberLevel(1);
			level.setSpeedWithLevel();
			GameView frame = new GameView(413, 472);
			frame.setVisible(true);
			l.setVisible(false);
		}
		if (e.getSource() == l.btNormal) {

			level.setNumberLevel(2);
			level.setSpeedWithLevel();
			GameView frame = new GameView(413, 472);
			frame.setVisible(true);
			l.setVisible(false);
		}
		if (e.getSource() == l.btHard) {
			level.setNumberLevel(3);
			level.setSpeedWithLevel();
			GameView frame = new GameView(413, 472);
			frame.setVisible(true);
			l.setVisible(false);
		}
		if (e.getSource() == l.btExit) {
			MenuGameView menu = new MenuGameView(530, 646);
			menu.setVisible(true);
			l.setVisible(false);
		}

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		Sound.playSound("D:\\git\\GameSnake\\src\\data\\ding.wav");
		if (e.getSource() == l.btEasy) {
			ImageIcon iconEasy = new ImageIcon("D:\\git\\GameSnake\\src\\data\\easy1.png");
			l.btEasy.setIcon(iconEasy);
			l.btEasy.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == l.btNormal) {
			ImageIcon iconNormal = new ImageIcon("D:\\git\\GameSnake\\src\\data\\normal1.png");
			l.btNormal.setIcon(iconNormal);
			l.btNormal.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == l.btHard) {
			ImageIcon iconHard = new ImageIcon("D:\\git\\GameSnake\\src\\data\\hard1.png");
			l.btHard.setIcon(iconHard);
			l.btHard.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == l.btExit) {
			ImageIcon iconExit = new ImageIcon("D:\\git\\GameSnake\\src\\data\\exit1.png");
			l.btExit.setIcon(iconExit);
			l.btExit.setPreferredSize(new Dimension(102, 40));
		}
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == l.btEasy) {
			ImageIcon iconEasy = new ImageIcon("D:\\git\\GameSnake\\src\\data\\easy.png");
			l.btEasy.setIcon(iconEasy);
			l.btEasy.setPreferredSize(new Dimension(87, 35));

		}
		if (e.getSource() == l.btNormal) {
			ImageIcon iconNormal = new ImageIcon("D:\\git\\GameSnake\\src\\data\\normal.png");
			l.btNormal.setIcon(iconNormal);
			l.btNormal.setPreferredSize(new Dimension(87, 35));
		}
		if (e.getSource() == l.btHard) {
			ImageIcon iconHard = new ImageIcon("D:\\git\\GameSnake\\src\\data\\hard.png");
			l.btHard.setIcon(iconHard);
			l.btHard.setPreferredSize(new Dimension(87, 35));
		}
		if (e.getSource() == l.btExit) {
			ImageIcon iconExit = new ImageIcon("D:\\git\\GameSnake\\src\\data\\exit.png");
			l.btExit.setIcon(iconExit);
			l.btExit.setPreferredSize(new Dimension(87, 35));
		}

	}

}
