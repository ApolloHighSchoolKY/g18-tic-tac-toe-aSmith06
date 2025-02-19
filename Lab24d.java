//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		//Read how many times to read
		int loopy = file.nextInt();
		
		//file.nextLine() <- returns entire remaining line as single string
		System.out.print(file.nextLine());

		
		//Make a TicTacTie object for each line in the file
		//Print the game(object) and winner
		for(int i = 0; i < loopy; i++)
			System.out.println(new TicTacToe(file.nextLine()));

		file.close();
	}
}



