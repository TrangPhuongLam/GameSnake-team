package model;

public class Level {
	static int numberLevel = 1;
	private int numberOfMushroom;
	private BorderTouchBehavior borderTouchBehavior;
	private SpeedFactory speedFactory;
	static int speedGame = 300;

	private void level() {
		// TODO Auto-generated method stub
		//setSpeedWithLevel();
		speedFactory = new SpeedFactory();
	}
	public int getNumberLevel() {
		return numberLevel;
	}
	public void setNumberLevel(int numberLevel) {
		this.numberLevel = numberLevel;
	}
	public void setSpeedGame(int speed) {
		speedGame = speed;
	}
	public int getSpeed() {
		return speedGame;
	}
	
	public void setSpeedWithLevel() {
		if(getNumberLevel() == 1) {
			Speed speed = speedFactory.getSpeed(SpeedDescription.EASY);
			speed.setSpeed();
		}
		if(getNumberLevel() == 2) {
			Speed speed = speedFactory.getSpeed(SpeedDescription.NORMAL);
			speed.setSpeed();
		}
		if(getNumberLevel() == 3) {
			Speed speed = speedFactory.getSpeed(SpeedDescription.HARD);
			speed.setSpeed();
		}
		
	}
	public int getNumberOfMushroom() {
		return numberOfMushroom;
	}
	public void setNumberOfMushroom(int numberOfMushroom) {
		this.numberOfMushroom = numberOfMushroom;
	}
	public void setBorderTouchBehavior(BorderTouchBehavior borderTouchBehavior) {
		this.borderTouchBehavior = borderTouchBehavior;
	}
	public void touchTheBorder() {
		if(getNumberLevel() == 1 || getNumberLevel() == 2) {
			borderTouchBehavior = new TouchNotDie();
			borderTouchBehavior.touchTheBorder();
		}
		else {
			borderTouchBehavior = new TouchThenDie();
			borderTouchBehavior.touchTheBorder();
		}
}
}