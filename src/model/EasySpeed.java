package model;

public class EasySpeed implements Speed{
	private Level level;
	
	public EasySpeed(Level level) {
		this.level = level;
	}
	
	@Override
	public void setSpeed() {
		level.setSpeedGame(300);	
	}

}