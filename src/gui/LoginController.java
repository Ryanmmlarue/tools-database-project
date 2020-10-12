package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Controller{

    @FXML
    TextField usernameField;
    @FXML
    PasswordField passwordField;



    @FXML
    public void login(ActionEvent event) {
        //TODO: Insert New User Data into SQL Server
        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println(username + " " + password);

        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        changeScene("FXML/home.fxml", 400, 500, "Home");
    }

    @FXML
    public void createNewAccount(ActionEvent event) {
        ((Stage)(((Hyperlink)event.getSource()).getScene().getWindow())).close();
        changeScene("FXML/newAccount.fxml", 400, 500, "Create New Account");
    }



}
