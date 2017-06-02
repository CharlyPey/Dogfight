package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile {
	private int				speed;
	private Direction		direction;
	private Position		position;
	private Dimension		dimension;
	private final String	image;

	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) {
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.image = image;

	}

	public int getWidht() {
		return 1;
	}

	public void moveUp() {

	}

	public void moveRight() {

	}

	public void moveLeft() {

	}

	public Color getColor() {
		return null;

	}

	public IDogfightModel getDogfightModel() {
		return null;

	}

	public void setDogfightModel(final IDogfightModel dogfightModel) {

	}

	public void setSpeed(final int speed) {
		this.speed = speed;
	}

	public void setDirection(final Direction direction) {
		this.direction = direction;
	}

	public void setPosition(final Position position) {
		this.position = position;
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public void setDimension(final Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection() {
		// TODO Auto-generated method stub

	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void placeInArea(final IArea area) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(final int payer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(final DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

}