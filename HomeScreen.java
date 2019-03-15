/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguiatm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ADMIN
 */
public class HomeScreen {

    Stage stage;
    Scene scene;
    double balance;

    TestGuiAtm testGuiAtm;
    Scene scene1;
    Scene scene2;
    Scene scene3;
    Scene scene4;
     Scene scene5;
     Scene scene7;
    validation logic = new validation();
    Label G=new Label() ;
    Label L=new Label() ;
    TextField amount = new TextField();
    TextField withdrawned=new TextField();
    Label withdrawnedamount = new Label();
Label showbalanceamount=new Label();
    public HomeScreen(Stage stage) {
        this.stage = stage;
    }

    public void prepareScene() {
        Label welcome = new Label("welcome");
        Button submit = new Button("back");
        Button deposit = new Button("deposit");
        Button withdraw = new Button("withdraw");
        Button showbalance = new Button("show balance");
        Button next = new Button("next");
        GridPane grid = new GridPane();
        grid.add(welcome, 0, 0);
        grid.add(showbalance, 0, 1);
        grid.add(next, 0, 2);
        grid.add(submit, 0, 3);
        grid.add(deposit, 0, 4);
        grid.add(withdraw, 0, 5);
        scene = new Scene(grid, 600, 400);
        //show balance scene
      
        //show
        
        
        Button previous=new Button("previous");
        Label currentbalance=new Label("your currentbalance is"+logic.getBalance());
        GridPane grid7=new GridPane();
        grid7.add(currentbalance,0,0);
        grid7.add(previous, 0, 1);
        scene7=new Scene(grid7,600,400);
        
        
        
        previous.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene);

            }
        });
        
        
        
        
        
        showbalance.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene7);

            }
        });
        
        
//deposit scene
       
        Label depositwindow = new Label("deposit");

        Button submit1 = new Button("submit");
        Button submit2 = new Button("back");
        GridPane grid1 = new GridPane();
        grid1.add(depositwindow, 0, 0);
        grid1.add(submit1, 0, 1);
        grid1.add(amount, 1, 0);
        grid1.add(submit2, 1, 1);
        scene1 = new Scene(grid1, 600, 400);
//withdraw scene          
        Label withdrawwindow = new Label("withdraw");

        Button submit3 = new Button("submit");
        Button submit4 = new Button("back");
        GridPane grid3 = new GridPane();
        grid3.add(withdrawwindow, 0, 0);
        grid3.add(submit3, 0, 1);
        grid3.add(withdrawned, 1, 0);
        grid3.add(submit4, 1, 1);
        scene3 = new Scene(grid3, 600, 400);

        //deposit confirm
        
        Button back3=new Button("back");

        GridPane grid2 = new GridPane();
        grid2.add(L, 1, 0);
        grid2.add(back3, 1, 1);
        scene2 = new Scene(grid2, 600, 400);
        //end.................
          back3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene1);

            }
        });
//deposit Scene submit1(submit)

        submit1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double x;
                x = Double.parseDouble(amount.getText());
                double z = logic.deposit1(x);
                L.setText("your balance :"+z);
                stage.setScene(scene2);

            }
        });
//withdraw confirm
        GridPane grid5 = new GridPane();
        Button back2=new Button("back"); 
        grid5.add(withdrawnedamount, 0, 1);
         grid5.add(G,1,0);
         grid5.add(back2, 1, 2);
         scene4 = new Scene(grid5, 600, 400);

         back2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene3);

            }
        });
         
  //withdraw Scene submit3(submit)
        submit3.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
          double x;            
                x = Double.parseDouble(withdrawned.getText());
                double z = logic.withdraw1(x);
                G.setText("your balance : "+z);
         stage.setScene(scene2);

         }
         });

//withdraw scene submit4 (withdraw back to homescreen)
        submit4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene);

            }
        });
        


        //withdrawscene show
        withdraw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene3);

            }

        });

//deposit Scene submit2(back)
        submit2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene);

            }
        });
        

        //depositscene show
        deposit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(scene1);

            }

        });
        //End of Scene

//back scene
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(testGuiAtm.getScene());

            }

        });

        //end of back scene
    }

    
    
    
    public Scene getScene() {
        return scene;
    }

    public void setTestGuiAtm(TestGuiAtm testGuiAtm) {
        this.testGuiAtm = testGuiAtm;
    }

}
