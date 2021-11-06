package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         */ 
    	var holder1 = new StrictBankAccount(1, 5000, 10);
    	var holder2 = new StrictBankAccount(2, 10_000, 9);
    	
    	/* 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	try {
        	holder2.deposit(3, 10);
		} catch (WrongAccountHolderException e) {
			System.out.println(e.getMessage());
		}
    	
    	try {
    		for(int i = 0; i < 10 ; i++) {
        		holder1.depositFromATM(1, 10);
        	}
    		holder1.depositFromATM(1, 10);
    		
		} catch (TransactionsOverQuotaException e) {
			System.out.println(e.getMessage());
		}
    	
    	holder1 = new StrictBankAccount(1, 50, 10);
    	
    	try {
			holder1.withdraw(1, 60);
		} catch (NotEnoughFoundsException e) {
			System.out.println(e.getMessage());
		}
    	
    }
}
