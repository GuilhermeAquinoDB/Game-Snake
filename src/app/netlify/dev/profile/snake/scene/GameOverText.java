package app.netlify.dev.profile.snake.scene;

import static app.netlify.dev.profile.snake.util.Constants.GAME_OVER_COLOR;
import static app.netlify.dev.profile.snake.util.Constants.GAME_OVER_TEXT;
import static app.netlify.dev.profile.snake.util.Constants.GAME_OVER_LOCATION;

import app.netlify.dev.profile.snake.graphics.Text;

public class GameOverText extends Text {
	
	public GameOverText(int score) {
		super(GAME_OVER_COLOR, String.format(GAME_OVER_TEXT, score), GAME_OVER_LOCATION);
	}

}
