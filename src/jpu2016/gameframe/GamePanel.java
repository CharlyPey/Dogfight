package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {
	/**
	 *
	 */
	private static final long	serialVersionUID	= -5123288060403239869L;
	private IGraphicsBuilder	graphicsBuilder;

	public GamePanel(final IGraphicsBuilder graphicBuilder) {
		this.setGraphicsBuilder(graphicBuilder);

	}

	@Override
	public void paintComponent(final Graphics graphic) {

	}

	@Override
	public void update(final Observable arg0, final Object arg1) {
		this.graphicsBuilder.applyModelToGraphic(graphics, observer);
	}

	public IGraphicsBuilder getGraphicsBuilder() {
		return this.graphicsBuilder;
	}

	public void setGraphicsBuilder(final IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}
}
