package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	/**
	 *
	 */
	private static final long		serialVersionUID	= -5123288060403239869L;
	private final IGraphicsBuilder	graphicsBuilder;

	public GamePanel(final IGraphicsBuilder graphicBuilder) {
		this.graphicsBuilder = graphicBuilder;

	}

	public void update(final Observable observable) {

	}

	@Override
	public void paintComponent(final Graphics graphic) {

	}
}
