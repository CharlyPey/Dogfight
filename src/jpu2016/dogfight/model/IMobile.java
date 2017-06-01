package jpu2016.dogfight.model;

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

	public setDogfightModel( Dogfight Model.jpu2016.dogfight.model.DogfightMode dogfightModel);

	public boolean hit();

	public boolean isWeapon();
}
