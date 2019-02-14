package com.code.io;

public class Output {

	public static void printMat(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printInt(int num) {
		System.out.println(num);
	}
}
