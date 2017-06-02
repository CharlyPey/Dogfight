package jpu2016.dogfight.model;

import java.awt.Color;

import com.sun.prism.Image;

public class Mobile implements IMobile {
	private int			speed;
	private Direction	direction;
	private Position	position;
	private Dimension	dimension;
	private Image		image;

	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final Image image) {

		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.image = image;

	}

	@Override
	public int getHeight() {
		return 1;

	}

	public int getWidht() {
		return 1;
	}

	@Override
	public void move() {

	}

	@Override
	public void placeInArea(final IArea area) {

	}

	@Override
	public boolean isPlayer(final int player) {
		return false;
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

	@Override
	public boolean hit() {
		return false;
	}

	@Override
	public boolean isWeapon() {
		return false;

	}

	@Override
	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(final int speed) {
		this.speed = speed;
	}

	@Override
	public Direction getDirection() {
		return this.direction;
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
	public Image getImage() {
		return this.image;
	}

	public void setImage(final Image image) {
		this.image = image;
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
	public void setDogfightModel(final DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

}