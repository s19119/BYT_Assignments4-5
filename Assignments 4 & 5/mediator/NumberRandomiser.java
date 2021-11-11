package mediator;

public class NumberRandomiser extends Thread{
	
	private NumberMediator mediator;

	public NumberRandomiser(NumberMediator mediator) {
		this.mediator = mediator;
	}
	
	public void run() {
		while(true) {
			try {
				int random = (int) (Math.random()*100);
				mediator.notify(this, random + "");
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
