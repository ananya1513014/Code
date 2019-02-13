package com.code.util;


import com.code.io.Input;

public class Operations {
  
  public int operation(int[][]arrr, int row, int col)
  {
/*    Input myObj = new Input(inputObj);
    int [][] arr = myObj.getMatrix().clone();
   System.out.println(myObj.hashCode() + "  " + myObj.getMatrix());
    System.out.println(inputObj.hashCode() + " " + inputObj.getMatrix());
    System.out.println(arr);
*/    int max = -1;
    
int[][] arr = arrr.clone();
    for(int i=row; i<4; i++)
    {
      for(int j=col; j<4; j++)
      {
        if(i>row&&j>col)
          arr[i][j]=arr[i][j-1]+arr[i-1][j]+arr[i][j]-arr[i-1][j-1];
        else if(i>row&&j==col)
          arr[i][j]=arr[i][j]+arr[i-1][j];
        else if(i==row && j>col)
          arr[i][j]=arr[i][j]+arr[i][j-1];
        else if(i==row&&j==col)
          arr[i][j]=arr[i][j];
        
        if(arr[i][j]>max) max = arr[i][j];
      }
    }
    return max;
  }
}
