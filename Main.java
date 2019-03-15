/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguiatm;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Atm APP");
        TestGuiAtm testGuiAtm = new TestGuiAtm(primaryStage);
        HomeScreen homescreen = new HomeScreen(primaryStage);
        testGuiAtm.preparescene();
        homescreen.prepareScene();
        testGuiAtm.setHomeScreen(homescreen);
        homescreen.setTestGuiAtm(testGuiAtm);
        
        primaryStage.setScene(testGuiAtm.getScene());
        
        primaryStage.show();

    }

}
