package jpu2016.dogfight.model;

import com.sun.javafx.scene.paint.GradientUtils.Point;
import com.sun.prism.Image;

public interface IMobile {

	public Direction getDirection();

	public void setDirection();

	public Point getPosition();

	public int getWidth();

	public int getHeight();

	public int getSpeed();

	public Image getImage();

	public void move();

	public void placeInArea(IArea area);

	public boolean isPlayer(int payer);

	public void setDogfightModel(DogfightModel dogfightModel);

	public boolean hit();

	public boolean isWeapon();
}
