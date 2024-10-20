package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class NodeStyle extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: rgba(176,212,244,0.44); " +
                "-fx-border-color: rgba(182,78,198,0.8)");
        root.setRotate(45);
        Button button = new Button("Click me");
        button.setStyle("-fx-background-color: rgba(179, 222, 121, 0.80); " +
                "-fx-border-color: rgba(182,78,198,0.8);");
        button.setScaleX(-1);

        root.getChildren().add(button);
        Scene scene = new Scene(root, 450, 500);

        primaryStage.setTitle("JavaFX NodeStyle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
