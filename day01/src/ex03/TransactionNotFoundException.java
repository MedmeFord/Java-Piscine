package ex03;

public class TransactionNotFoundException extends RuntimeException{
	public TransactionNotFoundException() {
		super("Transaction not found!");
	}
}
