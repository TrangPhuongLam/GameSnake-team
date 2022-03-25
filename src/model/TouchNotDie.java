package model;

import view.ScreenGame;

public class TouchNotDie implements BorderTouchBehavior {
//	private Snake snake;
	private ScreenGame screenGame;
	private GameState state;
	public TouchNotDie() {
		state = new GameState();
		//this.snake = snake;
		screenGame = new ScreenGame();
	}
	@Override
	public void touchTheBorder() {
//		if (snake.getArrX()[0] < 0)
//			snake.setX(19);
//		if (snake.getArrY()[0] < 0)
//			snake.setY(19);
//		if (snake.getArrX()[0] > 19)
//			snake.setX(0);
//		if (snake.getArrY()[0] > 19)
//			snake.setY(0);
	}
}
