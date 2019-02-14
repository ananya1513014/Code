package com.code.util;

import com.code.io.Input;

public class Operations {

	public int operation(Input inputObj, int row, int col) {
		int[][] arr = copyArray(inputObj.getMatrix());
		int max = -1;
		for (int i = row; i < inputObj.getNoOfRows(); i++) {
			for (int j = col; j < inputObj.getNoOfColumns(); j++) {
				if (i > row && j > col)
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j] + arr[i][j] - arr[i - 1][j - 1];
				else if (i > row && j == col)
					arr[i][j] = arr[i][j] + arr[i - 1][j];
				else if (i == row && j > col)
					arr[i][j] = arr[i][j] + arr[i][j - 1];
				else if (i == row && j == col)
					arr[i][j] = arr[i][j];

				if (arr[i][j] > max)
					max = arr[i][j];
			}
		}
		return max;
	}

	public static int[][] copyArray(int[][] arr) {
		int[][] result = new int[arr.length][arr[0].length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				result[i][j] = arr[i][j];
			}
		}
		return result;
	}
}
