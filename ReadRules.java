package com.checkers.pack;

import java.util.*;
import java.io.*;
/**
 * @author PAUL
 *
 */
public class ReadRules {
	
	public ArrayList<String> movesList = new ArrayList<String>();
	/**
	 * @param f
	 * @throws IOException
	 */
	public void readLines(File file) throws IOException
	{
		FileReader reader = new FileReader(file);
		BufferedReader breader = new BufferedReader(reader);
		String moves;
		
		while((moves = breader.readLine())!= null)
		{
			movesList.add(moves);
		}
		breader.close();
		reader.close();
	}
}

