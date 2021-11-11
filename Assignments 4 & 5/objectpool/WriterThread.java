package objectpool;

public class WriterThread extends Thread{
	
	private PencilPool pencils;
	private int id;
	
	public WriterThread(PencilPool pool, int id) {
		pencils = pool;
		this.id = id;
	}
	
	public void run() {
		while(true) {
			Pencil pencil = pencils.acquireObject();
			System.out.println("Writer " + id + " is writing something with " + pencil);
			try {
				Thread.sleep((long) (Math.random()*6000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pencils.releaseObject(pencil);
		}
	}
}
