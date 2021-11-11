package objectpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PencilPool implements ObjectPool<Pencil>{
	
	private BlockingQueue<Pencil> pool;
	
	public PencilPool(int size) {
		init(size);
	}
	
	private void init(int size) {
		pool = new ArrayBlockingQueue<>(size);
		for(int i = 0; i < size; i++) {
			pool.add(new Pencil(i));
		}
				
	}

	@Override
	public synchronized Pencil acquireObject() {
		try {
			return pool.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void releaseObject(Pencil object) {
		boolean returned = pool.offer(object);	
		while(!returned) {
			returned = pool.offer(object);
		}
	}

}
