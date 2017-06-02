package jpu2016_dogfight.Control;

import jpu2016.dogfight.controller.IUserOrder;

public class UserOrder implements IUserOrder {

	private int player;
	private final Order order;

	public UserOrder(final int player, final Order order) {
		this.order = order;
	}

	@Override
	public int getPlayer() {
		return this.player;
	}

	@Override
	public Order getOrder() {
		return this.order;

	}

}