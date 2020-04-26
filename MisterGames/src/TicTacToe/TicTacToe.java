package TicTacToe;

public class TicTacToe {
	private char[][] board = new char[3][3];

	public TicTacToe() {
		int row;
		int col;
		for (row = 0; row <= 2; row++) {
			for (col = 0; col <= 2; col++) {
				this.board[row][col] = '-';
			}
		}

	}

	public void setState(int row, int col, char newState) {
		this.board[row][col] = newState;

	}

	public boolean checkColumn() {
		for (int row = 0; row <= 2; row++) {
			if (this.board[row][0] == 'X') {
				if (this.board[row][1] == 'X') {
					if (this.board[row][2] == 'X') {
						return true;
					}
				}
			} else {
				if (this.board[row][0] == 'O') {
					if (this.board[row][1] == 'O') {
						if (this.board[row][2] == 'O') {
							return true;
						}
					}
				}
			}
		}
		return false;

	}

	public boolean checkRow() {
		for (int col = 0; col <= 2; col++) {
			if (this.board[0][col] == 'X') {
				if (this.board[1][col] == 'X') {
					if (this.board[2][col] == 'X') {
						return true;
					}
				}
			} else {
				if (this.board[0][col] == 'O') {
					if (this.board[1][col] == 'O') {
						if (this.board[2][col] == 'O') {
							return true;
						}
					}
				}
			}
		}
		return false;

	}

	public boolean checkDiaganol() {
		if (this.board[0][0] == 'X') {
			if (this.board[1][1] == 'X') {
				if (this.board[2][2] == 'X') {
					return true;
				}
			}
		} else {
			if (this.board[0][0] == 'O') {
				if (this.board[1][1] == 'O') {
					if (this.board[2][2] == 'O') {
						return true;
					}
				}
			}
		}
		
		if (this.board[0][2] == 'X') {
			if (this.board[1][1] == 'X') {
				if (this.board[2][0] == 'X') {
					return true;
				}
			}
		} else {
			if (this.board[0][2] == 'O') {
				if (this.board[1][1] == 'O') {
					if (this.board[2][0] == 'O') {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	public boolean checkWin() {
		if(!checkRow()) {
			if(!checkColumn()){
				if(!checkDiaganol()) {
					return false;
				}
			}
		} return true;
	} 

	public void printBoard() {
		int row;
		int col;
		for (row = 0; row <= 2; row++) {
			for (col = 0; col <= 2; col++) {
				System.out.print(this.board[row][col]);
			}
			System.out.println();
		}
	}
}
