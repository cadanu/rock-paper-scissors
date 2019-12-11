/* FXMLRpsController.java: controller class for fxml document in rps package
 * Assignment 2: Richard Persaud and Gordon Joyce
 */

package joycego;

import java.net.URL;
import java.util.ResourceBundle;
import java.security.SecureRandom;

import javafx.beans.binding.NumberBinding;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.NumberStringConverter;
import javafx.scene.Group;

public class FXMLRpsController implements Initializable {

	private Player player = new Player();
	private Player computer = new Player();
	//private Rps rps;

	//private Player play;
	//private SecureRandom rnd = new SecureRandom();
	//private Rps rps;
	//private ImageView compChoice;

	@FXML
	Label whoWins, lblPlayerScore, lblCompScore;

	@FXML
	Button rockImg, paperImg, scissorImg, resetBtn, exitBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		rockImg.setOnAction((event) -> {
			player.makeMove("ROCK");
			//System.out.println("Control - rockImg: " + player.move);
			imgClicked();
		});

		paperImg.setOnAction((event) -> {
			player.makeMove("PAPER");
			//System.out.println("Control - paperImg: " + player.move);
			imgClicked();
		});

		scissorImg.setOnAction((event) -> {
			player.makeMove("SCISSORS");
			//System.out.println("Control - scissorImg: " + player.move);
			imgClicked();
		});

		resetBtn.addEventHandler(ActionEvent.ACTION, (event) -> {
			player.move = null;
			computer.move = null;
			// to add
		});

		exitBtn.addEventHandler(ActionEvent.ACTION, (event) -> {
			System.exit(0);
		});

		/*lblPlayerScore
		lblPlayerScore.addEventHandler(ActionEvent.ACTION, (event) -> {

		});

		//lblCompScore
		lblCompScore.addEventHandler(ActionEvent.ACTION, (event) -> {

		});*/

	}// end Initialize

	public void imgClicked() {
		// debug
		System.out.println("Control - player.move: " + player.move);

		// gets random generated Rps enum
		getAI();

		//player.incrementScore();
		//System.out.println(player.getScore());

		System.out.println("Control - computer.move: " + computer.move);
		//System.out.println("Control - player.getScore: " + player.getScore());
		//System.out.println("Control - computer.getScore: " + computer.getScore());


		// changes compChoice picture
		//changePicture();
		// changes text in labels
		changeText();
	}

	public void getAI() {
		computer.makeRandomMove();
	}

	public void changePicture() {
		String picName = computer.move.getName().toLowerCase() + ".png";
		//Image image = new Image(picName);
		//compChoice.setImage(image);
		//Image image = new Image(rock.png);
		//System.out.println(computer.move.getName().toLowerCase() + ".png");
	}

	public void changeText() {
		String whoWon;
		// determine if tie - or - who wins ? then set text
		if(player.move.tie(player.move, computer.move))
		{
			whoWon = "It's a tie!";
			//System.out.println("It's a tie");
		}
		else if(player.move.win(player.move, computer.move))
		{
			whoWon = "You win!";
			//player.incrementScore();
		}
		else {
			whoWon = "Computer wins!";
			//computer.incrementScore();
		}
		whoWins.setText(whoWon);


		// bind lblPlayerScore/lblCompScore to score Property
		//lblPlayerScore.textProperty().bind(ObservableValue o, player.scoreProperty());
	}

}// end of FXMLRpsController