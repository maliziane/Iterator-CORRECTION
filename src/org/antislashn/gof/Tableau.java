package org.antislashn.gof;

public class Tableau implements List<Integer>{
	private int[] tab;
	private int size;
	
	public Tableau(int size) {
		tab = new int[size];
	}
	
	@Override
	public boolean add(int t) {
		if(size<tab.length) {
			tab[size++] = t;
			return true;
		}
		return false;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new TableauIterator(this);
	}
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void clear() {
		size=0;
	}
	
	private class TableauIterator implements Iterator{
			private Tableau tableau;
			private int index = 0;

		public TableauIterator(Tableau tableau) {
			this.tableau = tableau;
		}

		@Override
		public boolean hasNext() {
			return index < tableau.size;
		}

		@Override
		public int get() {
			return tableau.tab[index++];
		}
		
	}


}
