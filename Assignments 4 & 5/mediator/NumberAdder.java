package mediator;

public class NumberAdder {
	
	private NumberMediator mediator;
	private int storedNumber;

	public NumberAdder(NumberMediator mediator) {
		this.mediator = mediator;
		storedNumber = -1;
	}

	public void store(String message) {
		int number = Integer.parseInt(message);
		if(storedNumber >= 0) {
			int sum = storedNumber + number;
			mediator.notify(this, sum + "");
			storedNumber = -1;
		}
		else {
			storedNumber = number;
		}
	}

}
