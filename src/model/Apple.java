package model;

import java.awt.Graphics;
import java.awt.Point;

import view.ScreenGame;



public class Apple extends Food {
	ScreenGame screenGame;

	public Apple(ScreenGame screenGame) {
		this.screenGame = screenGame;
		this.paintStrategy = new PaintApple(screenGame);
		this.foodStrategy = new RandomApple(screenGame);
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
