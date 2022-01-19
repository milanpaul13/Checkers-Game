package com.checkers.pack;

import java.awt.Color;

/**
 * @author PAUL
 *
 */
public class CheckerBoard {

    /** Number of rows */
    public static final int rows = 8;
    /** Number of columns */
    public static final int columns = 8;
    /** An array of Squares that represents the game board */
    private Grid[][] checkerBoard;


    /** Constructor takes no args and produces a Board of size rows x columns with alternating background colors */
    public CheckerBoard() {
    	
		
    	checkerBoard = new Grid[rows][columns];
    	
    	//Set up the game board with alternating colors
    	boolean lastcolor = false;
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < columns; j++) {
    			
    			if(lastcolor)
    				checkerBoard[i][j] = new Grid(Grid.BackgroundColor.LIGHT, i, j);
    			else
    				checkerBoard[i][j] = new Grid(Grid.BackgroundColor.DARK, i, j);
    			
    			//Toggle lastcolor
    			lastcolor = !lastcolor;
    		}
    		
    		//Switch starting color for next row
    		lastcolor = !lastcolor;
    	}

    	
    }
    
    /** Check to see if a position in this Board is in bounds
     * 
     * @param row			The row to be checked
     * @param col			The column to be checked
     * @return				True if in bounds, false if not
     */
    public static boolean inBounds(int row, int col) {
    	if(row >= 0 && row < rows &&
    		col >= 0 && col < columns)
    		
    		return true;
    	
    	
    	return false;
    	
    }
    
    
    /** Get a particular Square contained in this Board
     * 
     * @param row		The row at which the square should be
     * @param col		The column at which the square should be
     * 
     * @return			The square at (row, col), or null if (row, col) is out-of-bounds
     */
    public Grid getSquares(int row, int col) {
        if(inBounds(row, col))
        	return checkerBoard[row][col];
        
        
        return null;
    }
    
    /** Fill this Board with Red pieces on top, and Black pieces on bottom */
    public void placeStartingPieces() {
    	
		//Have the Red side on top, Black side on bottom
		//Establish the Red side first
		for(int row = 0; row < 3; row++)
			for(int col = 0; col < 8; col++)
				if(getSquares(row, col).getBackgroundColor() == Grid.BackgroundColor.DARK)
					getSquares(row,col).setOccupant(new Elements(Color.BLACK, row, col));
		
		//Now establish the Black side
		for(int row = 5; row < 8; row++)
			for(int col = 0; col < 8; col++)
				if(getSquares(row, col).getBackgroundColor() == Grid.BackgroundColor.DARK)
					getSquares(row,col).setOccupant(new Elements(Color.RED, row, col));
    }
    
    
}
