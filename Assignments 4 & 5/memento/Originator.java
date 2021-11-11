package memento;

public interface Originator {

	public void restore(Memento memento);
	
	public Memento createMemento();
}
