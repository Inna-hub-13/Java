package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;


public class ButtonInPane extends Application {

   @Override
    public void start(Stage primaryStage) throws Exception {

       StackPane root = new StackPane();
       Button btn = new Button("OK");
       root.getChildren().add(btn);
       primaryStage.setTitle("Button In Pane");
       primaryStage.setScene(new Scene(root, 450, 500));
       primaryStage.show();
   }
}
