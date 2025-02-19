//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[][] {{'X', 'O', 'X'},{'O', 'X', 'O'},{'X', 'O', 'X'}};

	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		//out.println(game);
		int pos = 0;
		for(int row = 0; row < mat.length; row++){
			for(int col =0 ; col < mat[row].length; col++){
				mat[row][col] = game.charAt(pos);
				
				pos++;
			}
		}


	}

	public String getWinner()
	{

		//If first letter = second letter and second letter = thrid letter
		//that letter is the winner

		String squwimble = "";
		for(char[] row: mat)
			for(char col: row)
				squwimble += col;

		for(int i = 0; i < squwimble.length()-2; i+=3){
			if(squwimble.charAt(i) == squwimble.charAt(i+1) && squwimble.charAt(i) == squwimble.charAt(i+2))
				return squwimble.charAt(i) + " wins horizontally!";
		}

		// X X X 
		//       X X X
		//			   X X X
		// 0 1 2 3 4 5 6 7 8 9

		for(int i = 0; i < squwimble.length()/3; i++){
			if(squwimble.charAt(i) == squwimble.charAt(i+3) && squwimble.charAt(i) == squwimble.charAt(i+6))
				return squwimble.charAt(i) + " wins vertically";
		}
		// X     X     X 
		//   X     X     X
		//     X     X     X
		// 0 1 2 3 4 5 6 7 8 9

		if(squwimble.charAt(0) == squwimble.charAt(4) && squwimble.charAt(4) == squwimble.charAt(8))
			return squwimble.charAt(0) + " wins diagonally!";

		if(squwimble.charAt(2) == squwimble.charAt(4) && squwimble.charAt(4) == squwimble.charAt(6))
			return squwimble.charAt(2) + " wins diagonally";
		// X       X       X
		//     X   X   X
		// 0 1 2 3 4 5 6 7 8 9

		return "Cat's game - no winner!";
	}

	public String toString()
	{
		String output="";

		for(char[] row: mat){
			for(char col: row){
				output += col + " ";
			}
			output += "\n";
		}

		output += getWinner();

		return output+"\n\n";
	}
}