package model;

import view.View;

public interface Model {
	
	public void registerView(View view);
	
	public void removeView(View view);
	
	public void notifyModelChange();

}
