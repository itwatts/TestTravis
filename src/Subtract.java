import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Subtract implements CButton {
	public void draw(Button button1, final TextField numOne, final TextField numTwo, final Label label1) {
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (numOne.getText() != null && !numOne.getText().isEmpty() 
					&& numTwo.getText() != null && !numTwo.getText().isEmpty()) {
					try {
						double i = Double.parseDouble(numOne.getText()) - Double.parseDouble(numTwo.getText());
						i = Math.round(i*10000)/10000.0d;
			            label1.setText("Result: " + Double.toString(i));
					} catch(NumberFormatException e) {
						label1.setText("Invalid Input");
					}
		        } else {
		            label1.setText("A field is empty");
		        }
			}
		});
	}
}
