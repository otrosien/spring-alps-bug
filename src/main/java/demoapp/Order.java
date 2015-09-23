package demoapp;

import org.springframework.data.annotation.Id;
import org.springframework.hateoas.Identifiable;

public class Order implements Identifiable<String> {

	@Id
	private String id;

	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String getId() {
		return id;
	}
	
	/**
	 * Enumeration for all the statuses an {@link Order} can be in.
	 */
	public static enum Status {

		/**
		 * Placed, but not paid yet. Still changeable.
		 */
		PAYMENT_EXPECTED,

		/**
		 * {@link Order} was paid. No changes allowed to it anymore.
		 */
		PAID

	}
}
