package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] h ;
	public ArrayList() {
		 h = (T[])new Object[0];
	}
	
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc>=h.length&&loc<=h.length) {
	throw new IndexOutOfBoundsException() ;
		}
		
		return h[loc];
	}
	public void add(T val) {
	T[] n = (T[]) new Object[h.length+1];
	for (int i = 0; i < h.length; i++) {
		n[i] = h[i];
	}
	n[n.length-1] = val;
	h = n;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if(loc>=h.length&&loc<=h.length) {
	throw new IndexOutOfBoundsException() ;
		}

	else {
	

		for (int i = 0; i < h.length; i++) {
			if(i==loc) {
				h[loc] = val;
			}
			else if(i<loc) {
			h[i] = h[i];
			}
		}
		
	}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if(loc>=h.length&&loc<=h.length) {
	throw new IndexOutOfBoundsException() ;
		}
	
	else {
		
		h[loc] = val;
	}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] n = (T[]) new Object[h.length-1];
		for (int i = 0; i < h.length; i++) {
			if(i<loc) {
				n[i] = h[i];
			}
		}
		h = n;
	}
	
	public boolean contains(T val) {
		
		return false;
	}

	public int size() {

		return h.length;
	}

	
}