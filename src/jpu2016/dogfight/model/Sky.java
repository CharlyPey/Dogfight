package jpu2016.dogfight.model;

import java.awt.Dimension;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private Dimension	dimension;
	private Image		image;

	public Sky(Dimension dimension) {
		this.dimension = dimension;
		this.image = ImageIO.read(input);

	}

	@Override
	public Dimension getDimension() {
		return null;
	}

	@Override
	public Image getImage() {
		return null;

	}

}
