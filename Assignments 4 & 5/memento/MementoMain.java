package memento;

public class MementoMain {

	public static void main(String[] args) {
		Message message = new Message("Hello world", "Me", "World");
		message.print();
		Memento memento = message.createMemento();
		message.changeMessageText("Goodbye world");
		message.print();
		message.restore(memento);
		message.print();
	}

}
