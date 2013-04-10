
public class SingleBuffer<E> {
	
	private E [] element;
	private boolean isEmpty;
	

	@SuppressWarnings("unchecked")
	public SingleBuffer() {
	
	element = (E[]) new Object[1];
	isEmpty = true;
		
	}
	
	public boolean put(E x) {
		
		if (isEmpty) {
			element[0] = x;
			isEmpty = false;
			return true;
		}
		else return false;	
	}
	
	public E get() {
		if(!isEmpty) {
		E elem = element[0];
		element[0] = null;
		return elem;
		}
		
		else return null;
	}
	
	
}
