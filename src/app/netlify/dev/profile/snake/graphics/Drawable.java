package app.netlify.dev.profile.snake.graphics;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Drawable {

	private Color color;
	
	public Drawable() {
		color = Color.BLACK;
	}
	
	public Drawable(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	// method implementado somente nas subs classes
	public abstract void draw(Graphics g);
}
