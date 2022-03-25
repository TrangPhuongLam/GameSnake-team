package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ControllerScreenGame;
import model.Apple;
import model.Data;
import model.Food;
import model.GameState;
import model.Mushroom;
import model.Score;
import model.Snake;

public class ScreenGame extends JPanel implements Runnable {

	Thread thread;
	private ControllerScreenGame c;

//	ArrayList<View> list = new ArrayList<View>();
	public ScreenGame() {
		thread = new Thread(this);
		c = new ControllerScreenGame(this);
		thread.start();
	}

	public int sizeFrame() {
		return c.sizeFrame();
	}

	public void paint(Graphics g) {
		c.paint(g);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {

			c.handleState();
			repaint();

			try {
				thread.sleep(20);
			} catch (InterruptedException e) {
			}
		}
	}

}
