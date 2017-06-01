package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	public GraphicsBuilder(final IDogfightModel dogfightModel) {

	}

	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {

	}

	private void buildEmptySky() {

	}

	private void drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer) {

	}

	public int getGlobalWidth() {
		return 1;

	}

	public int getGlobalHeight() {
		return 1;
	}
}
