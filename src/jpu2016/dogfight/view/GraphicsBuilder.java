package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import fr.exia.showboarddemo.Monster;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	private final IDogfightModel	dogfightModel;
	private BufferedImage			emptySky;

	public GraphicsBuilder(final IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
		this.buildEmptySky();
	}

	@Override
	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {
		for (final IMobile mobile : this.dogfightModel.getMobiles()) {
			this.drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer);
		}
	}

	private void buildEmptySky() {
		this.setEmptySky(new BufferedImage(this.getGlobalWidth(), this.getGlobalHeight(), Transparency.TRANSLUCENT));
	}

	private void drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer) {
		final BufferedImage imageMobile = new BufferedImage(mobile.getWidth(), mobile.getHeight(),
				Transparency.TRANSLUCENT);
		final Graphics graphicsMobile = imageMobile.getGraphics();
		graphicsMobile.drawImage(mobile.getImage(), 0, 0, mobile.getWidth(), mobile.getHeight(), observer);
		graphics.drawImage(imageMobile, (int) mobile.getPosition().getX(), (int) mobile.getPosition().getY(), observer);
		final boolean isHorizontalOut = (mobile.getPosition().getX() + mobile.getWidth()) > this.getGlobalWidth();
		final boolean isVerticalOut = (mobile.getPosition().getY() + mobile.getHeight()) > this.getGlobalHeight();
		if (isHorizontalOut) {
			final BufferedImage imageMobileH = imageMobile.getSubimage(
					this.getGlobalWidth() - (int) mobile.getPosition().getX(), 0,
					(mobile.getWidth() - this.getGlobalWidth()) + (int) mobile.getPosition().getX(),
					mobile.getHeight());
			graphics.drawImage(imageMobileH, 0, (int) mobile.getPosition().getY(), observer);
		}
		if (isVerticalOut) {
			final BufferedImage imageMobileV = imageMobile.getSubimage(0,
					this.getGlobalHeight() - (int) mobile.getPosition().getY(), mobile.getWidth(),
					(mobile.getHeight() - this.getGlobalHeight()) + (int) mobile.getPosition().getY());
			graphics.drawImage(imageMobileV, (int) mobile.getPosition().getX(), 0, observer);
		}
		if (isHorizontalOut && isVerticalOut) {
			final BufferedImage imageMobileHV = imageMobile.getSubimage(
					this.getGlobalWidth() - (int) mobile.getPosition().getX(),
					this.getGlobalHeight() - (int) mobile.getPosition().getY(),
					(mobile.getWidth() - this.getGlobalWidth()) + (int) mobile.getPosition().getX(),
					(mobile.getHeight() - this.getGlobalHeight()) + (int) mobile.getPosition().getY());
			graphics.drawImage(imageMobileHV, 0, 0, observer);
		}
	}

	@Override
	public int getGlobalWidth() {
		return (int) this.dogfightModel.getArea().getDimension().getWidth();
	}

	@Override
	public int getGlobalHeight() {
		return (int) this.dogfightModel.getArea().getDimension().getHeight();
	}

	public BufferedImage getEmptySky() {
		return this.emptySky;
	}

	public void setEmptySky(final BufferedImage emptySky) {
		this.emptySky = emptySky;
	}

}
