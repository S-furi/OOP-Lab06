package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 1L;
	private final int nTransactions;
	
	
	public TransactionsOverQuotaException(final int nTransaction) {
		super();
		this.nTransactions = nTransaction;
	}
	
	public String toString() {
		return "Error: operation n. " + this.nTransactions + ", cannot do more ATM transactions.";
	}
	
	public String getMessage() {
		return this.toString();
	}

}
