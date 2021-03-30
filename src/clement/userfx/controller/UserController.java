package clement.userfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import clement.userfx.model.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UserController implements Initializable {

	private User user;
	@FXML
	private TextField txtPrenom;
	@FXML
	private TextField txtNom;
	@FXML
	private Button buttonSend;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		buttonSend.setOnMouseClicked(mouseEvent -> {
			user = new User();
			user.setPrenom(txtPrenom.getText());
			user.setNom(txtNom.getText());
			user.afficher();
		});
	}
}
