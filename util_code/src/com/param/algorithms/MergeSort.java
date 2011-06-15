package com.param.algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Algorithm demonstrating merge sort
 * 
 * 
 * @author parampreetsethi
 * 
 */
public class MergeSort {

	public static void main(String[] args) {
		// input numbers here
		int num[] = {28, -1, 2, 4, 1, 9, 46, 35, 81, 3, 7, 10 };
		int[] results = mergeSort(num);
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i] + " ");
		}
	}

	public static int[] mergeSort(int[] num) {
		if (num.length <= 1)
			return num;
		int middle = num.length / 2;
		int left[] = new int[middle];
		int right[] = new int[num.length-middle];

		for (int i = 0; i < middle; i++) {
			left[i] = num[i];
		}

		for (int i = middle, j = 0; i < num.length && j < right.length; i++, j++) {
			right[j] = num[i];
		}

		left = mergeSort(left);
		right = mergeSort(right);

		int[] result = merge_using_queue(left, right);
		// Find left and right of array
		// sort the smaller lists
		// once sorted merge the list according to the order

		return result;
	}

	/**
	 * Merge left and right into combined lists according to their sorting
	 * priority
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] merge_using_queue(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		Queue<Integer> leftQue = new LinkedList<Integer>();
		Queue<Integer> rightQue = new LinkedList<Integer>();
		for (int i = 0; i < left.length; i++) {
			leftQue.add(left[i]);
		}
		for (int i = 0; i < right.length; i++) {
			rightQue.add(right[i]);
		}
		int count = 0;

		while (leftQue.size() > 0 || rightQue.size() > 0) {
			if (leftQue.size() > 0 && rightQue.size() > 0) {
				// compare elements in both the list
				int leftelem = leftQue.peek();
				int rightelem = rightQue.peek();
				if (leftelem < rightelem) {
					result[count] = leftQue.poll();
				} else
					result[count] = rightQue.poll();
			} else if (leftQue.size() > 0) {
				int leftelem = leftQue.peek();
				// compare first elem with last elem of right and append
				// accordingly.
				if (count > 0) {
					if (result[count - 1] > leftelem) {
						int temp = result[count - 1];
						result[count - 1] = leftQue.poll();
						result[count] = temp;
					} else {
						result[count] = leftQue.poll();
					}
				} else {
					// append the leftQue in result
					for (int i = 0; i < leftQue.size(); i++) {
						result[i] = leftQue.poll();
					}
					break;

				}
			} else {
				// compare first elem with last elem of left and append
				// accordingly.
				if (count > 0) {
					int rightelem = rightQue.peek();
					if (result[count - 1] > rightelem) {
						int temp = result[count - 1];
						result[count - 1] = rightQue.poll();
						result[count] = temp;
					} else {
						result[count] = rightQue.poll();
					}
				} else {
					for (int i = 0; i < rightQue.size(); i++) {
						result[i] = leftQue.poll();
					}
					break;
				}
			}
			count++;
		}
		return result;
	}
	
	
	/**
	 * 
	 * use queues instead of array Algo
	 * 
	 * function merge(left,right) var list result while length(left) > 0 or
	 * length(right) > 0 if length(left) > 0 and length(right) > 0 if
	 * first(left) ² first(right) append first(left) to result left = rest(left)
	 * else append first(right) to result right = rest(right) else if
	 * length(left) > 0 append first(left) to result left = rest(left) else if
	 * length(right) > 0 append first(right) to result right = rest(right) end
	 * while return result
	 * 
	 * @param left
	 * @param right
	 * @return
	 */

	public static int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		int count = 0;
		while (left.length > 0 || right.length > 0) {

			System.out.println(count);
			if (left.length > 0 && right.length > 0) {
				// merge here
				if (left[0] > right[0]) {
					merged[count] = right[0];
					System.arraycopy(right, 0, right, 1, right.length);
				} else
					merged[count] = left[0];
				System.arraycopy(left, 0, left, 1, left.length);
			} else if (left.length > 0) {
				merged[count] = left[0];
				System.arraycopy(left, 0, left, 1, left.length);
			} else if (right.length > 0) {
				merged[count] = right[0];
				System.arraycopy(right, 0, right, 1, right.length);
			}
			count++;
		}
		return merged;
	}

}
