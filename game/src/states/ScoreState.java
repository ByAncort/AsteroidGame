package states;

import java.awt.Color;
import java.awt.Graphics;



import gameObjects.Constants;
import graphics.Assets;
import graphics.Text;

import math.Vector2D;
import ui.Action;
import ui.Button;

public class ScoreState extends State{
	
	private Button returnButton;
	
	
	

	
	public ScoreState() {
		returnButton = new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Assets.greyBtn.getHeight(),
				Constants.HEIGHT - Assets.greyBtn.getHeight() * 2,
				Constants.RETURN,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new MenuState());
					}
				}
			);
		
		
	
		
	}
	
	@Override
	public void update(float dt) {
		returnButton.update();
	}

	@Override
	public void draw(Graphics g) {
		returnButton.draw(g);
		
		
		
		
		Vector2D scorePos = new Vector2D(
				Constants.WIDTH / 2 - 200,
				100
				);
		Vector2D datePos = new Vector2D(
				Constants.WIDTH / 2 + 200,
				100
				);
		
		Text.drawText(g, Constants.SCORE, scorePos, true, Color.BLUE, Assets.fontBig);
		Text.drawText(g, Constants.DATE, datePos, true, Color.BLUE, Assets.fontBig);
		
		scorePos.setY(scorePos.getY() + 40);
		datePos.setY(datePos.getY() + 40);
		
	
		
			scorePos.setY(scorePos.getY() + 40);
			datePos.setY(datePos.getY() + 40);
			
		}
		
	}
	

