package com.code;

import com.code.io.Input;
import com.code.io.Output;
import com.code.util.Operations;

public class Main {

  public static void main(String[] args)
  {
    Operations operationsObj = new Operations();
    
   // Input inputObj = new Input();
    
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    
    for(int i=0; i<4; i++)
    {
      for(int j=0; j<4; j++)
      {
/*          Output.printMat(inputObj.getMatrix());
          Output.printInt(operationsObj.operation(inputObj, 2, 2));
*/                Output.printMat(matrix);
Output.printInt(operationsObj.operation(matrix, 2, 2));

        }
    }
  }
}