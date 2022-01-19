package com.checkers.pack;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI implements MouseListener,
									ActionListener {
	
	/** The panel that will hold our Board */
	private JPanel boardpanel;
	
	/** The frame that will hold the contents of our game */
	private JFrame frame;
	
	/** The board which will store our game's state */
	private CheckerBoard board;

	/** Border width between squares in the game board */
	private final int borderWidth = 1;
	
	/** Constructor takes no arguments and forms a new game */
	public UI() {
		
		//display the interface
		CreateAndShowGUI();
		
	}
	
	/** Set up the visual interface to the game */
	public void CreateAndShowGUI() {
		
		//Set up the window information
		frame = new JFrame("Checkers V1 - Milan Paul");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 625));		
		
		frame.getContentPane().setLayout(
				new GridBagLayout());
		
		//Give the Board a visual representation
		boardpanel = new JPanel(new GridLayout(8, 8));
		boardpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		board = new CheckerBoard();
		board.placeStartingPieces();

		JPanel panel = new JPanel();
		//Add our board to board panel and add everything to the window
		addBoardToPanel(board, boardpanel);
		
		JButton button1 = new JButton("Next");
		JButton button2 = new JButton("Previous");
		button2.setEnabled(false);
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button1);
		panel.add(button2);

		frame.add(boardpanel);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.pack();
		
		//Resize the frame as it cuts off the last character of our JLabel
		Rectangle boundingRect = frame.getBounds();
		frame.setBounds(boundingRect.x, boundingRect.y, boundingRect.width, boundingRect.height);
		frame.setPreferredSize(new Dimension(250, 250));
		frame.setVisible(true);
	}
	
	/** Add the Board to a Panel to create the appearance of a checkerboard
	 * 
	 * @param b						The Board to add to a JPanel 
	 * @param p						the JPanel to be added to
	 */
	public void addBoardToPanel(CheckerBoard b, JPanel p) {
		for(int m = 0; m < 8; m++) {
			for(int n = 0; n < 8; n++) {
				Grid sq = b.getSquares(m, n);
				sq.addMouseListener(this);
				
				JPanel ContainerPanel = new JPanel(new FlowLayout());
				ContainerPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,borderWidth));
				ContainerPanel.add(sq);
				if(sq.getBackgroundColor() == Grid.BackgroundColor.DARK)
					ContainerPanel.setBackground(Color.DARK_GRAY);
				else
					ContainerPanel.setBackground(Color.LIGHT_GRAY);
				p.add(ContainerPanel);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO if action performed
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO if mouse clicked
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO if mouse entered
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO if mouse exited
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO if mouse pressed
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO if mouse released
		
	}

}
