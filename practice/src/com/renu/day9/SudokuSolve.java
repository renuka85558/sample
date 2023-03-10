package com.renu.day9;

public class SudokuSolve {
private static final int Grid_size=9;

	public static void main(String[] args) {
		int [][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		if(boardSolve(board)) {
			System.out.println(" board solved successfull !");
		}
		else {
			System.out.println("board unsolved ");
			
		}
printBoard(board);
	}
private static void printBoard(int[][] board) {

for(int row =0; row <Grid_size;row++) {
	if(row % 3 ==0 && row != 0) {
		System.out.println("------------------");
	}
	for(int column =0; column <Grid_size;column++) {
		if(column % 3==0 && column != 0) {
			System.out.print(" | ");
		}
		System.out.print(board[row][column]);
	}
	System.out.println();
}
		
	}
private static boolean isNumberInRow(int[][] board, int number,int row) {
	
for(int i=0;i<Grid_size;i++) {
	if(board[row][i]==number) {
		return true;
	}
}
return false;
}
private static boolean isNumberInColumn(int[][] board, int number,int column) {
	
for(int i=0;i<Grid_size;i++) {
	if(board[i][column]==number) {
		return true;
	}
}
return false;
}
private static boolean isNumberInBox(int[][] board, int number,int row,int column) {
	int localBoxRow =row - row % 3;
	int localBoxColumn = column - column % 3;
for(int i=localBoxRow ; i < localBoxRow + 3;i++) {
	for(int j=localBoxColumn ;j<localBoxColumn + 3;j++) {
	
		if(board[i][j]==number) {
			return true;
		}
	}
	
}
return false;
}
private static boolean isValidPlacement(int[][] board, int number,int row,int column) {
	return !isNumberInRow(board, number,row) && !isNumberInColumn(board, number, column)
			&& !isNumberInBox(board, number, row, column);
}
private static boolean boardSolve(int[][]board) {
	for(int row=0; row< Grid_size; row++) {
		for(int column=0;column <Grid_size;column++) {
			if(board[row][column]==0) {
				for(int numberToTry=1; numberToTry<=Grid_size;numberToTry++) {
					if(isValidPlacement(board, numberToTry, row, column)) {
						board[row][column]=numberToTry;
						if(boardSolve(board)) {
							return true;
						}
						else {
							board[row][column]=0;
						}
					}
				}
				return false;
			}
		}
	}
	return true;
}
}

