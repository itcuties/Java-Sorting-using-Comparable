package com.itcuties.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Test the solution.
 * 
 * @author itcuties
 *
 */
public class Main {

	public static void main(String[] args) {
		// Dollar values
		int[] values = new int[] {1,5,10,50,100};
		
		Random random = new Random();
		
		// Our sample wallet
		List<Dollar> wallet = new ArrayList<Dollar>();
		
		// Money random generation
		for (int i=0; i<10; i++) {
			Dollar d = new Dollar();
			d.setCountry("US");
			d.setValue(values[random.nextInt(values.length)]);
			
			// Add dollar to the wallet
			wallet.add(d);
		}
		
		// Display unsorted
		for (Dollar d: wallet)
			System.out.print(d + "\t");
		
		// Sort dollars in our wallet
		Collections.sort(wallet);
		
		System.out.println();
		
		// Display sorted
		for (Dollar d: wallet)
			System.out.print(d + "\t");
	}
	
}
