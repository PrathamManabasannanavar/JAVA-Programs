//A simple Java program to implement Tic Tac Toe game( XOX game )
import java.util.*;

class TicTacToe {
	private char arr[] = new char[9];
	TicTacToe() {
		for (int i = 0; i < 9; i++)
			arr[i] = Character.forDigit(i + 1, 10);
	}
	public void displayBoard() {
		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " | ");
			if ((i + 1) % 3 == 0)
				System.out.println();
		}
	}

	public void setValue(int i, char value) {
		arr[i] = value;
	}
	public boolean isFull() {
		for (int i = 0;  i < 9; i++)
			if (arr[i] > '0' && arr[i] < '9')
				return false;
		return true;
	}

	public boolean isValidIndex(int i) {
		return i >= 0 && i < 9 && arr[i] > '0' && arr[i] <= '9';
	}

	public char checkWinner() {
		if (arr[0] == arr[1] && arr[1] == arr[2])
			return arr[0];
		if (arr[3] == arr[4] && arr[4] == arr[5])
			return arr[3];
		if (arr[6] == arr[7] && arr[7] == arr[8])
			return arr[6];
		if (arr[0] == arr[3] && arr[3] == arr[6])
			return arr[0];
		if (arr[1] == arr[4] && arr[4] == arr[5])
			return arr[1];
		if (arr[2] == arr[5] && arr[5] == arr[8])
			return arr[2];
		if (arr[0] == arr[4] && arr[4] == arr[8])
			return arr[0];
		if (arr[2] == arr[4] && arr[4] == arr[6])
			return arr[2];
		return '\0';
	}

}

class sample {
	public static void main(String args[]) {
		int player = 1, choice;
		TicTacToe game = new TicTacToe();
		game.displayBoard();
		while (true) {
			if (game.isFull()) {
				System.out.println("It's a draw");
				break;
			}
			System.out.println("\nPlayer " + player);
			System.out.println("Enter one value between 1 - 9");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			choice--;
			if (!game.isValidIndex(choice)) {
				System.out.println("Index already occupied!!");
				continue;
			}
			if (player == 1) {
				game.setValue(choice, 'X');
				player = 2;

			} else if (player == 2) {
				game.setValue(choice, 'O');
				player = 1;
			}
			game.displayBoard();
			char value = game.checkWinner();
			if(value == 'X' || value == 'O')
			{
			if (value == 'X')
				System.out.println("\nPlayer 1 Won\n");
			else
				System.out.println("\nPlayer 2 Won\n");
			break;
			}
		}
	}
}
