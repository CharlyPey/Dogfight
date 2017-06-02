package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Observable;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	private final IDogfightModel	dogfightModel;
	private final BufferedImage		emptySky;

	public GraphicsBuilder(final IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
		this.emptySky = new BufferedImage(null, null, false, null);
	}

	@Override
	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {

	}

	private void buildEmptySky() {

	}

	private void drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer) {

	}

	@Override
	public int getGlobalWidth() {
		return 1;

	}

	@Override
	public int getGlobalHeight() {
		return 1;
	}

	@Override
	public void update(final Observable arg0, final Object arg1) {
		// TODO Auto-generated method stub

	}
}
