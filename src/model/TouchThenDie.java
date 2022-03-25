package model;

public class TouchThenDie implements BorderTouchBehavior{	
	private GameState state;
	private HighScore highScore;
	private Score score;
	public TouchThenDie() {		
		highScore = HighScore.getInstance();
		state = new GameState();
		score = new Score();
	}
	@Override
	public void touchTheBorder() {
		state.setPlaying(false);
		state.setIsgameOver(true); 
		highScore.save(score.getScore());
		}
		
	}


