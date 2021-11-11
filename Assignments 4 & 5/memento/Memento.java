package memento;

public class Memento {
	private String text;
	private String sender;
	private String receiver;

	public Memento(String text, String sender, String receiver) {
		this.text = text;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public String getText() {
		return text;
	}
	
	public String getSender() {
		return sender;
	}
	
	public String getReceiver() {
		return receiver;
	}

}
