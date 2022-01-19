package com.checkers.pack;

import java.awt.Color;

public class Elements {
	
	
	/** The current rows of the game board that this Piece resides on */
	private int rows;
	
	/** The current column of the game board that this Piece resides on */
	private int columns;
	
	/** The Color of this Piece */
	public Color color;
	
	
	/**Initialize a new Piece with the given color and at the given position
	 * 
	 * @param c			The color of the new Piece
	 * @param rows		The rows of the game board this piece lives on
	 * @param columns		The column of the game board this piece lives on
	 */
	public Elements(Color c, int rows, int columns) {

		color = c;
		this.rows = rows;
		this.columns = columns;
		
	}
	
	/** Get the rows of the game board that this Piece resides on
	 * 
	 * @return		The rows of the game board this Piece resides on
	 */
	public int getrows() {
		return rows;
	}
	
	/** Get the color of this piece
	 * 
	 * @return 				The color of this piece
	 */
	public Color getColor() {
		return color;
	}
	
	/** Get the column of the game board that this Piece resides on
	 * 
	 * @return		The column of the game board that this Piece resides on
	 */
	public int getCol() {
		return columns;
	}
	
	/** Give this Piece a new location to live on in the game board
	 * 
	 * @param rows		The new rows for this piece to live on
	 * @param columns		The new column for this piece to live on
	 */
	public void setLoc(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}

}
