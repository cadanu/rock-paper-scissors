/* Program.java: main class for rps
 * Assignment 2: Richard Persaud and Gordon Joyce
 */

package joycego;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Program extends Application {
	// main method signature
	public static void main(String[] args) {
		launch(args);

		//System.out.println(Rps.ROCK.getWinsOver());

		//FXMLRpsController control = new FXMLRpsController();

		//Rps eArray[] = Rps.values();
		//for(Rps rps : control.rps.values()) {
			//System.out.println(control.rps);
		//}
		//System.out.println(eArray[2]);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MyFrame.fxml"));
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Play Rock, Paper, Scissors: Fun Game!");
		primaryStage.show();

		//Label lblPlayerScore = new Label();
		//Player player = new Player();
		//lblPlayerScore.bind(player.getScore());
	}

}// end Program class