package jpu2016.dogfight.model;

import java.awt.Dimension;

import com.sun.prism.Image;

public class Sky implements IArea {
	private Dimension dimension;

	public Sky(Dimension dimension) {
		this.dimension = dimension;
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
