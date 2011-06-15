package com.param.prbs;

/**
 * Problem statement: Given Array A nXn dimensions, consisting of only integers.
 * 
 * The rows are in strictly increasing order and columns are in descreasing
 * order
 * 
 * Find occurances of a given number x
 * 
 * @author parampreetsethi
 * 
 */
public class FindNumberinArr {

	public static void main(String[] args) {

		int a[][] = { { 5, 6, 7, 8 }, 
				      { 4, 5, 6, 7 }, 
				      { 3, 4, 5, 6 },
				      { 2, 3, 4, 5 } };
//		on2Algo(a, 5);
		effAlgo(a, 2);
		//moreEffAlgo(a, 2);
	}

	/**
	 * Should be efficient than O(n^2) Algo
	 * 
	 * Complexity appears to be n+nln(n)
	 */
	public static void effAlgo(int[][] a, int x) {
		int count = 0;
		int mid = 0;
		int loopcount = 0;
		outer:for (int j = 0; j < a.length; j++) {
			mid = (a.length) / 2;
			while(mid>=0){
				System.out.println(j + " ** " + mid);
				loopcount++;
				if (x > a[j][mid]) {
					if(mid==a.length-1)
						break;
					mid = (mid + a.length) / 2;
				} else if (x < a[j][mid]) {
					if(mid==0)
						break;
					mid = mid / 2;
				} else if (x == a[j][mid]) {
					System.out.println("equal" + count);
					count++;
					break;
				}
			}
			
		}

		System.out.println(" should be faster *** x: " + x + " occured "
				+ count + "   times loop ran : " + loopcount + "   times");
	}
	
	
	/**
	 * Simple O(n^2) Algorithm
	 * 
	 * @param a
	 * @param x
	 */
	public static void on2Algo(int[][] a, int x) {
		int count = 0;
		int loopcount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				loopcount++;
				if (x == a[i][j])
					count++;
			}
		}

		System.out.println(" on2 ****** x: " + x + " occured " + count + "   times loop ran : " + loopcount + "   times");
	}

	/**
	 * Should be efficient than effAlgo Algo
	 * 
	 * 
	 * should make use of info, each element can occur once in row and column
	 * 
	 */
	public static void moreEffAlgo(int[][] a, int x) {
		int count = 0;
		int mid = a.length / 2;
		int loopcount = 0;
		
		outer:for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				loopcount++;
				if(x>a[j][mid]){
					i = (mid+a.length)/2;
				}else if(x<a[i][mid]){
					i = (mid)/2;
				}else if(x==a[i][mid]){
					count++;
					continue outer;
				}

			}
		}
		

		System.out.println(" should be faster than effAlgo *** x: " + x + " occured " + count + "   times loop ran : " + loopcount + "   times");
	}

}
