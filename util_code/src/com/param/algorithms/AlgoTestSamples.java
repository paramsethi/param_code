package com.param.algorithms;

public class AlgoTestSamples {
	
	public static void main(String[] args) {
		mystery(5);
	}
	
	public static void mystery(int n){
		int r=0;
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++){
				for(int k=1;k<=j;k++)
					r=r+1;
			}
				
		}
		System.out.println("for n = " + n + " ** r = " + r);
	}

}
