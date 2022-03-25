package model;

import java.awt.event.KeyEvent;

import view.GameView;

public class ModelGameView {

	private Direction direction;
	private GameState state;
	private Score score;
	private HighScore highScore;

	private GameView gameView;

	public ModelGameView(GameView gameView) {

		this.gameView = gameView;
		score = new Score();

		direction = new Direction();
		state = new GameState();
		highScore = HighScore.getInstance();
	}

	public void handlerKeyPress(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			state.setPlaying(!state.getPlaying());
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
			ModelScreenGame.snake.setVector(direction.GO_UP);

		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			ModelScreenGame.snake.setVector(direction.GO_DOWN);

		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			ModelScreenGame.snake.setVector(direction.GO_LEFT);

		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			ModelScreenGame.snake.setVector(direction.GO_RIGHT);
	}

	public void handlerScore() {
		gameView.labelScore.setText(score.getScore() + "");
		if (!highScore.get().isEmpty())
			gameView.labelMaxScore.setText(highScore.get().get(0) + "");
	}

}
