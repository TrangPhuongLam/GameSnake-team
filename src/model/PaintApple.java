package model;

import java.awt.Color;
import java.awt.Graphics;

import view.ScreenGame;

public class PaintApple extends PaintStrategy {

	public PaintApple(ScreenGame game) {
		super(game);
	}

	@Override
	public void paint(Graphics apple) {
		for (int i = 0; i < screenGame.sizeFrame(); i++)
			for (int j = 0; j < screenGame.sizeFrame(); j++) {
				if (ModelScreenGame.frameGame[i][j] == 2) {
					apple.setColor(Color.red);
					apple.drawImage(Data.apple.getCurrentImage(), i * 20, j * 20, null);
				}
			}
	}

}
