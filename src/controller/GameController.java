package controller;

import java.awt.Dimension;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.HighScore;
import model.Sound;
import view.GameView;
import view.HelpView;
import view.LevelView;
import view.MenuGameView;

public class GameController implements Controller {
	MenuGameView menuGame;

	public GameController(MenuGameView menuGame) {
		this.menuGame = menuGame;
	}

	@Override
	public void newGame() {
		GameView frame = new GameView(413, 472);
		frame.setVisible(true);
		menuGame.setVisible(false);
	}

	@Override
	public void exitGame() {
		if (JOptionPane.showConfirmDialog(menuGame, "Are you sure to Exit the Game", "Exit Game!!!",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_NO_OPTION)
			System.exit(0);
	}

	@Override
	public void scoreGame() {
		String str = "Best Score:" + "\n";

		if (HighScore.getInstance().get().size() <= 3) {
			for (int i = 0; i < HighScore.getInstance().get().size(); i++) {
				str += "no" + "." + (i + 1) + "    " + HighScore.getInstance().get().get(i) + "\n";
			}
		} else {
			for (int i = 0; i < 3; i++) {
				str += "no" + "." + (i + 1) + "    " + HighScore.getInstance().get().get(i) + "\n";
			}
		}
		JOptionPane.showConfirmDialog(menuGame, str, "High Score", JOptionPane.DEFAULT_OPTION,
				JOptionPane.DEFAULT_OPTION);

	}

	@Override
	public void levelGame() {
		LevelView lv = new LevelView(300, 350);
		lv.setVisible(true);
		menuGame.setVisible(false);

	}

	@Override
	public void helpGame() {
		// TODO Auto-generated method stub
		HelpView helpView = new HelpView(530, 646);
		helpView.setVisible(true);
		menuGame.setVisible(false);
	}

	public void mouseEntered(MouseEvent e) {
		Sound.playSound("D:\\git\\GameSnake\\src\\data\\ding.wav");
		// TODO Auto-generated method stub
		if (e.getSource() == menuGame.btPlay) {
			ImageIcon iconPlay = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Play1.png");
			menuGame.btPlay.setIcon(iconPlay);
			menuGame.btPlay.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == menuGame.btLevel) {
			ImageIcon iconLevel = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Level1.png");
			menuGame.btLevel.setIcon(iconLevel);
			menuGame.btLevel.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == menuGame.btScore) {
			ImageIcon iconScore = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Score1.png");
			menuGame.btScore.setIcon(iconScore);
			menuGame.btScore.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == menuGame.btOption) {
			ImageIcon iconOption = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Options1.png");
			menuGame.btOption.setIcon(iconOption);
			menuGame.btOption.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == menuGame.btHelp) {
			ImageIcon iconHelp = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Help1.png");
			menuGame.btHelp.setIcon(iconHelp);
			menuGame.btHelp.setPreferredSize(new Dimension(102, 40));
		}
		if (e.getSource() == menuGame.btExit) {
			ImageIcon iconExit = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Exit1.png");
			menuGame.btExit.setIcon(iconExit);
			menuGame.btExit.setPreferredSize(new Dimension(102, 40));
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == menuGame.btPlay) {
			ImageIcon iconPlay = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Play.png");
			menuGame.btPlay.setIcon(iconPlay);
			menuGame.btPlay.setPreferredSize(new Dimension(87, 35));
		}
		if (e.getSource() == menuGame.btLevel) {
			ImageIcon iconLevel = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Level.png");
			menuGame.btLevel.setIcon(iconLevel);
			menuGame.btLevel.setPreferredSize(new Dimension(87, 35));
		}
		if (e.getSource() == menuGame.btScore) {
			ImageIcon iconScore = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Score.png");
			menuGame.btScore.setIcon(iconScore);
			menuGame.btScore.setPreferredSize(new Dimension(87, 35));
		}
		if (e.getSource() == menuGame.btOption) {
			ImageIcon iconOption = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Options.png");
			menuGame.btOption.setIcon(iconOption);
			menuGame.btOption.setPreferredSize(new Dimension(87, 35));
		}
		if (e.getSource() == menuGame.btHelp) {
			ImageIcon iconHelp = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Help.png");
			menuGame.btHelp.setIcon(iconHelp);
			menuGame.btHelp.setPreferredSize(new Dimension(87, 35));
		}
		if (e.getSource() == menuGame.btExit) {
			ImageIcon iconExit = new ImageIcon("D:\\git\\GameSnake\\src\\data\\Exit.png");
			menuGame.btExit.setIcon(iconExit);
			menuGame.btExit.setPreferredSize(new Dimension(87, 35));
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Sound.playSound("D:\\git\\GameSnake\\src\\data\\pop.wav");
		if (e.getSource() == menuGame.btExit) {
			exitGame();
		}
		if (e.getSource() == menuGame.btScore) {
			scoreGame();
		}
		if (e.getSource() == menuGame.btPlay) {
			newGame();
		}
		if (e.getSource() == menuGame.btLevel) {
			levelGame();
		}
		if (e.getSource() == menuGame.btHelp) {
			helpGame();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
