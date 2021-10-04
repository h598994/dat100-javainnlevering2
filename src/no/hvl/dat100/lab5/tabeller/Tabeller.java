package no.hvl.dat100.lab5.tabeller;

import javax.swing.JOptionPane.*;

public class Tabeller {

	// a) t
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[");
		for (int tall : tabell) {
			System.out.print(tall + " ");
	}
		System.out.println("]");
}

	// b)
	public static String tilStreng(int[] tab) {
		String str = "[";
		
		for (int i = 0; i < tab.length; i++) {
			str = str + tab[i];
			if (i < tab.length - 1) {
				str = str + ",";
			}
		}
		str = str + "]";
		return str;
	}

	// c)
	public static int summer(int[] tab) {

		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		return sum;
	}
	
	public static int summerWhile(int[] tab) {
		
		int sum = 0;
		int teller = 0;
		while (teller < tab.length) {
			sum += tab[teller];
			teller++;
		}
		return sum;
	}
	
	public static int summerFor(int[] tab) {
		
		int sum = 0;
		for (int tall : tab) {
			sum = sum + tall;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tab, int tall) {

		boolean funnet = false;
		for (int i : tab) {
			if (i == tall) {
				funnet = true;
			}
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tab, int tall) {

		int pos = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tall == tab[i]) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tab) {

		int rev = tab.length;
		int[] nytabell = new int[rev];
		
		for (int i = 0; i < rev; i++) {
			nytabell[i] = tab[rev-1-i];
		}
		return nytabell;
	}

	// g)
	public static boolean erSortert(int[] tab) {

		boolean sotert = true;
		for (int i = 0; i < tab.length - 1; i++) {
			if (tab[i] > tab[i + 1]) {
				sotert = false;
			}
		}
		return sotert;
	}

	// h)
	public static int[] settSammen(int[] tab1, int[] tab2) {

		int lengde1 = tab1.length;
		int lengde2 = tab2.length;
		
		int[] nytabell = new int[lengde1 + lengde2];
		
		for (int i = 0; i < lengde1; i++) {
			nytabell[i] = tab1[i];
		}
		for (int i = 0; i < lengde2; i++) {
			nytabell[lengde1 + i] = tab2[i];
		}
		return nytabell;
	}
}
