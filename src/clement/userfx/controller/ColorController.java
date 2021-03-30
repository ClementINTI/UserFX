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
		TxtRed.textProperty().addListener(coucou -> {
			color.setRed(Integer.parseInt(TxtRed.getText()));
			updateValue();
		});
		TxtGreen.textProperty().addListener(coucou -> {
			color.setGreen(Integer.parseInt(TxtGreen.getText()));
			updateValue();
		});
		TxtBlue.textProperty().addListener(coucou -> {
			color.setBlue(Integer.parseInt(TxtBlue.getText()));
			updateValue();
		});

	}

	private void updateValue() {
		if (!sliderRed.isFocused())
			sliderRed.setValue(color.getRed());
		if (!sliderGreen.isFocused())
			sliderGreen.setValue(color.getGreen());
		if (!sliderBlue.isFocused())
			sliderBlue.setValue(color.getBlue());
		if (!TxtHexa.isFocused())
			TxtHexa.setText(color.getHexValue());
		if (!TxtRed.isFocused())
			TxtRed.setText(Integer.toString(color.getRed()));
		if (!TxtGreen.isFocused())
			TxtGreen.setText(Integer.toString(color.getGreen()));
		if (!TxtBlue.isFocused())
			TxtBlue.setText(Integer.toString(color.getBlue()));
		// panelColor.setStyle(value);
	}
}
