package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private final File		file	= null;
	private final Dimension	dimension;
	private Image			image	= null;

	public Sky(final Dimension dimension) {
		this.dimension = dimension;
		try {
			this.image = ImageIO.read(this.file);
		} catch (final IOException e) {
			e.printStackTrace();
		}

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
