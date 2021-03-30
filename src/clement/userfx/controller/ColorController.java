package clement.userfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import clement.userfx.model.Color;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ColorController implements Initializable {
	@FXML
	private Slider sliderRed;
	@FXML
	private Slider sliderGreen;
	@FXML
	private Slider sliderBlue;
	@FXML
	private TextField TxtHexa;
	@FXML
	private TextField TxtRed;
	@FXML
	private TextField TxtGreen;
	@FXML
	private TextField TxtBlue;
	@FXML
	private Pane panelColor;

	private Color color = new Color(0, 0, 0);

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		updateValue();
		TxtRed.setOnInputMethodTextChanged(coucou -> {
			color.setRed(Integer.parseInt(TxtRed.getText()));
			updateValue();
		});
		TxtGreen.setOnInputMethodTextChanged(coucou -> {
			color.setGreen(Integer.parseInt(TxtGreen.getText()));
			updateValue();
		});
		TxtBlue.setOnInputMethodTextChanged(coucou -> {
			color.setBlue(Integer.parseInt(TxtBlue.getText()));
			updateValue();
		});
	}

	private void updateValue() {
		sliderRed.setValue(color.getRed());
		sliderGreen.setValue(color.getGreen());
		sliderBlue.setValue(color.getBlue());
		TxtHexa.setText(color.getHexValue());
		TxtRed.setText(Integer.toString(color.getRed()));
		TxtGreen.setText(Integer.toString(color.getGreen()));
		TxtBlue.setText(Integer.toString(color.getBlue()));
		// panelColor.setStyle(value);
	}
}
