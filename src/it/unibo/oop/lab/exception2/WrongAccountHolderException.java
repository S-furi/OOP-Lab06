package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException {
	private static final long serialVersionUID = 1L;
	
	private final int expectedUsrId;
	private final int actualUsrId;
	
	/*
	 * @param expId
	 * 			expected id
	 * @param actId
	 * 			given id
	 */
	public WrongAccountHolderException(final int expId, final int actId) {
		super();
		this.expectedUsrId = expId;
		this.actualUsrId = actId;
	}
	
	public String toString() {
		return "Error: mismatch beetween expected user " + this.expectedUsrId +
					" and actual user " + this.actualUsrId;
	}
	
	public String getMessage() {
		String str = this.toString();
		return str;
	}
}
