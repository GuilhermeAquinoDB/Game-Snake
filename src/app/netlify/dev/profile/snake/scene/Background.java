package app.netlify.dev.profile.snake.scene;

import app.netlify.dev.profile.snake.graphics.Rect;
import app.netlify.dev.profile.snake.util.Constants;

public class Background extends Rect {
	
	public Background() {
		super(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setColor(Constants.BACKGROUND_COLOR);
	}

}
