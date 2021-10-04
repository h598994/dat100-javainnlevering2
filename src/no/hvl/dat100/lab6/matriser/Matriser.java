package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] i : matrise) {
			for(int j : i) {
			System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String alibaba = "";
		
		for(int[] i : matrise) {
			for(int j : i) {
			alibaba = alibaba + j + " ";
			}
			alibaba = alibaba + "\n";
		}
		return alibaba;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nymatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nymatrise;
	}
		

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		int row,col,row1,col1;
		boolean flag = true;
		row = a.length;
		col = a[0].length;
		row1 = b.length;
		col1 = b[0].length;
		
		if(row != row1 || col != col1) {
		}
		else {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					if(a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
		
	}
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
