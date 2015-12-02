package unittests;

import marsmission.OrionSpacecraftModel;

public class TestSpacecraftModel {

	/*
	 * main
	 */
	
	public static void main(String[] args) {
				
		OrionSpacecraftModel orion = new OrionSpacecraftModel();
		System.out.println("Orion spacecraft launch countdown...");
		
		if (orion.launch()) {
			System.out.println("Orion spacecraft successfully launched.");
		}
		else {
			System.out.println("Orion spacecraft launch scrubbed.");
		}
	
		System.out.println("Spacecraft test completed.");
	}
}
