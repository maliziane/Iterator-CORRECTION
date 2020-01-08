package org.antislashn.gof;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableauTest {

	@Test
	void testTableauConstructor() {
		Tableau t = new Tableau(10);
		assertNotNull(t);
		assertEquals(0, t.size());
	}

	@Test
	void testAdd1() {
		Tableau t = new Tableau(10);
		for(int i=0 ; i < 5 ; i++) {
			t.add(i);
		}
		assertEquals(5, t.size());
	}
	
	@Test
	void testAdd2() {
		Tableau t = new Tableau(10);
		for(int i=0 ; i < 15 ; i++) {
			t.add(i);
		}
		assertEquals(10, t.size());
	}

	@Test
	void testIteraror() {
		int[] tab = {1,2,3,4,5,6};
		Tableau t = new Tableau(10);
		for(int i=0 ; i < tab.length ; i++) {
			t.add(tab[i]);
		}
		Iterator it = t.iterator();
		assertNotNull(it);
		int i=0;
		while(it.hasNext()) {
			assertEquals(tab[i++], it.get());
		}
	}

}
