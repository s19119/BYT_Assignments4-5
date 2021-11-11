package objectpool;

public class ObjectPoolMain {

	public static void main(String[] args) {
		PencilPool pool = new PencilPool(5);
		for(int i = 0; i < 10; i++) {
			WriterThread thread = new WriterThread(pool, i);
			thread.start();
		}
	}

}
