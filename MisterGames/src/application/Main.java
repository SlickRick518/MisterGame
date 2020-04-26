package application;
	
import TicTacToe.TicTacToe;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe(); 
		game.setState(1, 2, 'O');
		game.setState(1, 1, 'O');
		game.setState(1, 0, 'O');
		game.printBoard();
		System.out.println(game.checkWin());
		launch(args);
		
	}
}
