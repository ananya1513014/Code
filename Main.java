package com.code;

import com.code.io.Input;
import com.code.io.Output;
import com.code.util.Operations;

public class Main {

	public static void main(String[] args) {
		Operations operationsObj = new Operations();

		Input inputObj = new Input();

		int max = -1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if ((operationsObj.operation(inputObj, i, j)) > max)
					max = operationsObj.operation(inputObj, i, j);
			}
		}

		Output.printInt(max);
	}
}
