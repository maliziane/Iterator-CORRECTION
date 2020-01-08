package org.antislashn.gof;

public interface List<T>{
	boolean add(T t);
	Iterator<T> iterator();
	int size();
	void clear();
}
