package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class ShowCircle extends Application {

   @Override
    public void start(Stage primaryStage) {

       Pane root = new Pane();
       Circle circle = new Circle(225,250,50);
       circle.setFill(Color.BLUEVIOLET);
       circle.setStroke(Color.BLACK);
       root.getChildren().add(circle);
       Scene scene = new Scene(root, 450, 500);

       primaryStage.setTitle("Circle");
       primaryStage.setScene(scene);
       primaryStage.show();

       primaryStage.setResizable(false);
   }

}
