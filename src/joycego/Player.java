/* Player.java: Player class for rps, models player object
 * Assignment 2: Richard Persaud and Gordon Joyce
 */

package joycego;

import java.util.Random;
import java.security.SecureRandom;
import java.util.InputMismatchException;
import com.sun.javafx.sg.prism.NGShape.Mode;
import javafx.beans.property.IntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ObservableIntegerValue;


public class Player {

	// declarations
	public Rps move;
	private IntegerProperty score;
	SecureRandom rnd = new SecureRandom();

	//public Rps move2;
	//public String strMove;
	//FXMLRpsController control;
	//private Rps rps;

	// constructor
	// default
	public Player() {
		super();
		//this.move = rps.lookUpByName.get(strMove);
	}

	// getters and setters (get/set from primitive types)
	public int getScore() {
		return score.get();
	}
	public void setScore(int score) {
		this.score.set(score);
	}

	// increment player score
	public void incrementScore() {
		setScore(getScore() + 1);
	}

	// ?
	public IntegerProperty scoreProperty() {
		return score;
	}

	// player move
	public void makeMove(String move) {
		//
		this.move = Rps.valueOf(move);
	}

	// Random (AI player) move
	public Rps makeRandomMove() {
		int rand = rnd.nextInt(3);
		//
		switch(rand) {
		case 0:
			this.move = Rps.ROCK;
			break;
		case 1:
			this.move = Rps.PAPER;
			break;
		case 2:
			this.move = Rps.SCISSORS;
			break;
		}
		//
		return this.move;
	}

	// to fix
	//public String toString() {
		//return Rps.values(this.move);
	//}
}// end Rps enum class
