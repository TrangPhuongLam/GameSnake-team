package model;

import java.awt.Graphics;
import java.awt.Point;

import view.ScreenGame;

public class Mushroom extends Food {
	ScreenGame screenGame;

	public Mushroom(ScreenGame screenGame) {
		this.screenGame = screenGame;
		this.paintStrategy = new PaintMushroom(screenGame);
		this.foodStrategy = new RandomMushroom(screenGame);
}

	@Override
	public Point randomFood() {
	return foodStrategy.randomFood();
	}


	@Override
	public void paint(Graphics mush) {
		paintStrategy.paint(mush);
	}	

}
