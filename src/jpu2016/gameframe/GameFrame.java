package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class GameFrame extends Observable implements KeyListener {

	private final GamePanel			gamePanel;
	private final IEventPerformer	eventPerformer;

	public GameFrame(final String title, final IEventPerformer performer, final IGraphicsBuilder graphicBuilder,
			final Observable observable) {
		this.gamePanel = new GamePanel(graphicBuilder);
		this.eventPerformer = performer;
	}

	@Override
	public void keyPressed(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
