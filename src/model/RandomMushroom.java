package model;

import java.awt.Point;
import java.util.Random;

import view.ScreenGame;

public class RandomMushroom extends RandomFoodStrategy {

	public RandomMushroom(ScreenGame game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Point randomFood() {
		Random r = new Random();
		int x;
		int y;
		do {
			x = r.nextInt(19);
			y = r.nextInt(19);
		} while (checkAppleInsideSnake(x, y));
		return new Point(x, y);
	}

	private boolean checkAppleInsideSnake(int x, int y) {
		for (int i = 0; i < ModelScreenGame.snake.getLength(); i++) {
			if (ModelScreenGame.snake.getArrX()[i] == x && ModelScreenGame.snake.getArrY()[i] == y) {
				return true;
			}
		}
		return false;
	}
}
