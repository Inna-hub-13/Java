package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CenterCircle extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        Circle circle = new Circle(150,150,50);
        root.getChildren().add(circle);

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLUE);
        circle.centerXProperty().bind(root.widthProperty().divide(2));
        circle.centerYProperty().bind(root.heightProperty().divide(2));

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Centered Circle");
        primaryStage.show();
    }
}
