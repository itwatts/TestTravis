
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
//import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// Information on double rounding in Java found here:
// https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java/12684082
public class Calculator extends Application {
	
	Label label1;
	Button button1, button2;
	CButton cb1, cb2;
	double i = 0.0;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calculator");
		label1 = new Label("Calculator Test");
		
		final TextField numOne = new TextField();
		final TextField numTwo = new TextField();		
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Scene scene = new Scene(grid, 400, 400);
		stage.setScene(scene);
		
		button1 = new Button("Addition");
		button2 = new Button("Subtraction");
		
		cb1 = CButtonFactory.getButton("ADD");
		cb2 = CButtonFactory.getButton("SUBTRACT");
		
		cb1.draw(button1, numOne, numTwo, label1);
		cb2.draw(button2, numOne, numTwo, label1);
		
		grid.add(label1, 0, 0);
		grid.add(button1, 1, 1);
		grid.add(button2, 1, 2);
		grid.add(numOne, 0, 1);
		grid.add(numTwo, 0, 2);
		
		stage.show();
	}
}
