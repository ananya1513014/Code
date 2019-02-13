package com.code.io;

import java.util.Scanner;

public class Input {

  private int noOfRows;
  private int noOfColumns;
  private int[][] matrix;

  static Scanner scannerObj = new Scanner(System.in);

  public Input(Input _obj) {
    this.noOfRows = _obj.noOfRows;
    this.noOfColumns = _obj.noOfColumns;
    this.matrix = _obj.matrix.clone();
        
  }
  public Input() {
    this.setNoOfRows();
    this.setNoOfColumns();
    this.setMatrix();
  }

  public int getNoOfRows() {
    return noOfRows;
  }

  public void setNoOfRows() {
    this.noOfRows = scannerObj.nextInt();
  }

  public int getNoOfColumns() {
    return noOfColumns;
  }

  public void setNoOfColumns() {
    this.noOfColumns = scannerObj.nextInt();
  }

  public int[][] getMatrix() {
    return matrix;
  }

  public void setMatrix() {
    this.matrix = new int[this.noOfRows][this.noOfColumns];
    
    for (int i = 0; i < this.noOfRows; i++) {
      for (int j = 0; j < this.noOfColumns; j++) {
        this.matrix[i][j] = scannerObj.nextInt();
      }
    }
  }

}
