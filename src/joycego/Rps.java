/* Rps.java: enum for rps constants
 * Assignment 2: Richard Persaud and Gordon Joyce
 */

package joycego;

import java.util.HashMap;


public enum Rps {

	// constant declarations
	ROCK("rock", "scissors"),
	PAPER("paper", "rock"),
	SCISSORS("scissors", "paper");

	// string declarations
	private String name;
	private String winsOver;

	// object declarations
	HashMap<String, Rps> lookUpByName = new HashMap<String, Rps>();

	// constructor
	private Rps(String name, String winsOver) {
		this.name = name;
		this.winsOver = winsOver;
	}

	// HashMap functionality
	void initNameLookup() {
		lookUpByName.put("rock", Rps.ROCK);
		lookUpByName.put("paper", Rps.PAPER);
		lookUpByName.put("scissors",  Rps.SCISSORS);
	}

	// getters
	public String getName() {
		return name;
	}
	public String getWinsOver() {
		return winsOver;
	}
	public Rps getRps(String name) {
		return lookUpByName.get(name);
	}

	// is tie ? tie is true
	public boolean tie(Rps other, Rps other2) {
		boolean bool;
		if(other == other2) { //get HashMap Rps then check equality against random Rps
			bool=true;// confirm output
		}
		else
		{
			bool=false;
		}
		//System.out.println("tie: " + bool);
		return bool;// <<
	}

	// who wins ? player win is true
	public boolean win(Rps other, Rps other2) {
		boolean bool = false;
		if(other.winsOver == other2.name) {
			bool=true;
		}
		else
			bool=false;
		//System.out.println("win: " + bool);
		return bool;// <<
	}

}// end rps class