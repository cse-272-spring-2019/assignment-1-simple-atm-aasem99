/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguiatm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ADMIN
 */
public class TestGuiAtm {

    Stage stage;
    Scene scene;
    
    validation authentication=new validation();
    HomeScreen homescreen;
 PasswordField passwordField;
 String passwrod;
    public TestGuiAtm(Stage stage) {
        this.stage = stage;
    }
TextField creditcardField = new TextField();
    public void preparescene() {
        validation validation = new validation();
        Label creditcardlabel = new Label("creditcard");
        Label passwordlabel = new Label("password");
         passwordField = new PasswordField();
        
        Button submit = new Button("submit");
        Label validationlabel = new Label();

        GridPane grid = new GridPane();
        grid.add(creditcardlabel, 0, 0);
       // creditcardlabel.setVisible(true);
        grid.add(passwordlabel, 0, 1);
     //   creditcardlabel.setVisible(true);
        grid.add(creditcardField, 1, 0);
        grid.add(passwordField, 1, 1);
        grid.add(submit, 1, 2);
        grid.add(validationlabel, 2, 3);
        
       submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                String creditcard = creditcardField.getText();
                passwrod = passwordField.getText();
                Label validationlabel = new Label();

                boolean valid = authentication.validate(creditcard, passwrod);

                if (valid) {
                    validationlabel.setText("welcomesir");
                    stage.setScene(homescreen.getScene());
                } else {
                    validationlabel.setText("wrongpassword");
                    validationlabel.setFont(new Font("Verdana", 20));
                }
            }
       });
         scene = new Scene(grid, 600, 400);
    }

    public Scene getScene() {
        return this.scene;
    }

    public void setHomeScreen(HomeScreen homescreen) {
        this.homescreen = homescreen;
    }
}

/**
 * @param args the command line arguments
 */
