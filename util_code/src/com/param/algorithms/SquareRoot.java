package com.param.algorithms;

public class SquareRoot {

	public static void main(String[] args) {
		// Test the Bi section function
		bisection(8f, 0.001f);
		bisection(4f, 0.001f);
		bisection(100f, 0.001f);
		bisection(0.25f, 0.001f);
	}

	public static void bisection(float num, float precision) {
		float low = 0f;
		float upper = Math.max(1f, num);
		float guess = (upper + low) / 2;
		int count = 0;
		while (Math.abs(guess * guess - num) > precision && count < 100) {
			if (guess * guess > num) {
				upper = guess;
				guess = (upper + low) / 2;
			} else{
				low = guess;
				guess = (upper + low) / 2;
			}
			count++;
		}
		System.out.println("Num is " + num + " : sqroot is " + guess
				+ " found in loops : " + count);
	}

}
