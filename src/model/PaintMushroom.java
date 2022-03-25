package model;

import java.awt.Color;
import java.awt.Graphics;

import view.ScreenGame;

public class PaintMushroom extends PaintStrategy{

	public PaintMushroom(ScreenGame game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics mush) {
//		mush.setColor(Color.red);
		for (int i = 0; i < screenGame.sizeFrame(); i++)
			for (int j = 0; j < screenGame.sizeFrame(); j++) {
				if (ModelScreenGame.frameGame[i][j] == -2) {
					mush.setColor(Color.gray);
//					mush.fillRect(i * 20, j * 20, 18, 18);
					mush.drawImage(Data.mushroom.getCurrentImage(),i*20,j*20,null);
				}

			}
	}

}
