package memento;

public class Message implements Originator{
	
	private String text;
	private String sender;
	private String receiver;
	
	public Message(String text, String sender, String receiver) {
		this.text = text;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public void changeMessageText(String newText) {
		text = newText;
	}
	
	public void changeMessageSender(String newSender) {
		sender = newSender;
	}
	
	public void restore(Memento memento) {
		text = memento.getText();
		sender = memento.getSender();
		receiver = memento.getReceiver();
	}
	
	public Memento createMemento() {
		return new Memento(text,sender,receiver);
	}
	
	public void print() {
		System.out.println("[Message]");
		System.out.println("From: " + sender);
		System.out.println("To: " + receiver);
		System.out.println(text);
		System.out.println();
	}

}
