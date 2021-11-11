package objectpool;

public interface ObjectPool<T> {
	
	public T acquireObject();
	
	public void releaseObject(T object);

}
