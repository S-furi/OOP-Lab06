package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException {

	private static final long serialVersionUID = 1L;
	
	private final double currAmount;
	private final double reqAmount;
	
	/**
	 * @param currAmount
	 * 			Current balance
	 * 
	 * @param reqAmount
	 * 			requested amount for a draw operation
	 */
	public NotEnoughFoundsException(final double currAmount, final double reqAmount) {
		super();
		this.currAmount = currAmount;
		this.reqAmount = reqAmount;
	}
	
	public String toString() {
		return "Error: current balance " + this.currAmount + " cannot draw " + this.reqAmount;
	}
	
	public String getMessage() {
		return this.toString();
	}
	

}
