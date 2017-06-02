package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {
	/**
	 *
	 */
	private static final long	serialVersionUID	= -5205816999645121205L;
	private final GamePanel		gamePanel;
	private IEventPerformer		eventPerformer;

	public GameFrame(final String title, final IEventPerformer performer, final IGraphicsBuilder graphicBuilder,
			final Observable observable) {
		this.gamePanel = new GamePanel(graphicBuilder);
		this.setEventPerformer(performer);
	}

	@Override
	public void keyPressed(final KeyEvent event) {
		this.eventPerformer.eventPerform(event);
	}

	@Override
	public void keyReleased(final KeyEvent event) {

	}

	@Override
	public void keyTyped(final KeyEvent event) {

	}

	public IEventPerformer getEventPerformer() {
		return this.eventPerformer;
	}

	public void setEventPerformer(final IEventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}

}
