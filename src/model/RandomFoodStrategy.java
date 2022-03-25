package model;

import java.awt.Point;

import view.ScreenGame;

public abstract class RandomFoodStrategy {
	ScreenGame screenGame;
	public RandomFoodStrategy(ScreenGame game) {
		this.screenGame = game;
	}
	public abstract Point randomFood();
}
