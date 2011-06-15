package com.param.algorithms;

/**
 * In place quick sort algorithm
 * @author parampreetsethi
 *
 */
public class QuickSort {
	
	public static void main(String[] args) {
		int num[] = {9,8,6,4,3,10};
		quicksort(num,0,num.length);
		System.out.println("hope it works! ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "\n");
		}
	}
	
	/**
	 * summary of algorithm
	 * 
	 * find random element as pivot (better use last elem as pivot instead of moving someone to end)
	 * 
	 * move lower elements towards the left of pivot and higher elements towards right
	 * 
	 * sort sub lists
	 * 
	 * 
	 * 
	 * @param num
	 */
	
	public static void quicksort(int[] num, int low, int high) {
		int pivot = high - 1;
		if (low < high) {
			partition(num, low, high, pivot);
			quicksort(num, low, pivot);
			quicksort(num, pivot+1, high);
		}
	}

	/**
	 * for given pivot move lower elements on left
	 * and higher element on right
	 * 
	 * @param num
	 * @param low
	 * @param high
	 * @param pivot
	 * @return
	 */
	public static void partition(int[] num, int low, int high, int pivot){
		int pivotVal = num[pivot];
		for (int i = low; i < high; i++) {
			if(num[i]>pivotVal && i<pivot){
				int temp = num[i];
				num[i] = num[pivot];
				num[pivot] = temp;
				pivot=i;
			}else if(num[i]<pivotVal && i>pivot){
				int temp = num[i];
				num[i] = num[pivot];
				num[pivot] = temp;
				pivot=i;
			}
		}
	}
	
	
}
