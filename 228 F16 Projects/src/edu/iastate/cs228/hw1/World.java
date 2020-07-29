package edu.iastate.cs228.hw1;

/**
 *  
 * @author
 *
 */

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner; 
import java.util.Random; 

/**
 * 
 * The world is represented as a square grid of size width X width. 
 *
 */
public class World 
{
	private int width; // grid size: width X width 
	
	public Living[][] grid; 
	
	/**
	 *  Default constructor reads from a file 
	 */
	public World(String inputFileName) throws FileNotFoundException
	{		
        // TODO 
		// 
		// Assumption: The input file is in correct format. 
		// 
		// You may create the grid world in the following steps: 
		// 
		// 1) Reads the first line to determine the width of the grid.
		// 
		// 2) Creates a grid object. 
		// 
		// 3) Fills in the grid according to the input file. 
		// 
		// Be sure to close the input file when you are done. 
		
		File file = new File(inputFileName);
		Scanner scanner = new Scanner(file);
		width = 1; 
		while(scanner.hasNextLine())
		{
			width++;
			scanner.nextLine(); 
		}
		String[][] temp; 
		String t; 
		
		 
		
		
	}
	
	/**
	 * Constructor that builds a w X w grid without initializing it. 
	 * @param width  the grid 
	 */
	public World(int w)
	{
		width = w; 
		grid = new Living[width][width]; 
	}
	
	
	public int getWidth()
	{
	
		return width;  // to be modified 
	}
	
	/**
	 * Initialize the world by randomly assigning to every square of the grid  
	 * one of BADGER, FOX, RABBIT, GRASS, or EMPTY.  
	 * 
	 * Every animal starts at age 0.
	 */
	public void randomInit()
	{
		Random generator = new Random(); 
		generator.nextInt(5);
		int t = 0; 
		for(int i=0; i < width;i++){
			for(int j=0; j < width; j++)
			{
				t = generator.nextInt(5);
				if( t == 0  ){
					grid[i][j] = new Badger(this, i, j , 0);
				}
				if( t==1){
					grid[i][j] = new Empty(this,i, j); 
				}
				if(t == 2 ){
					grid[i][j] = new Fox(this,i,j,0);
				}
				if(t == 3){
					grid[i][j] = new Grass(this,i,j); 
				}
				if( t == 4){
					grid[i][j] = new Rabbit(this,i,j,0);
				}
				
			}
		}
	}
	
	
	/**
	 * Output the world grid. For each square, output the first letter of the living form
	 * occupying the square. If the living form is an animal, then output the age of the animal 
	 * followed by a blank space; otherwise, output two blanks.  
	 */
	public String toString()
	{
		// TODO
		return null; 
	}
	

	/**
	 * Write the world grid to an output file.  Also useful for saving a randomly 
	 * generated world for debugging purpose. 
	 * @throws FileNotFoundException
	 */
	public void write(String outputFileName) throws FileNotFoundException
	{
		// TODO 
		// 
		// 1. Open the file. 
		// 
		// 2. Write to the file. The five life forms are represented by characters 
		//    B, E, F, G, R. Leave one blank space in between. Examples are given in
		//    the project description. 
		// 
		// 3. Close the file. 
	}			
}
