package mediator;

public class NumberMediator implements Mediator{
	
	private Displayer displayer;
	private NumberAdder numberAdder;
	private NumberRandomiser numberRandomiser;
	
	public NumberMediator() {
		displayer = new Displayer();
		numberAdder = new NumberAdder(this);
		numberRandomiser = new NumberRandomiser(this);
		numberRandomiser.start();
	}
	
	public void notify(Object sender, String message) {
		if(sender.equals(numberRandomiser)) {
			numberAdder.store(message);
		}
		if(sender.equals(numberAdder)) {
			displayer.display(message);
		}
	}

}
