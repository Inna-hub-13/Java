package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class TestFont extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane root = new StackPane();
        root.setStyle("-fx-background-color: rgba(182,78,198,0.8);");

        Circle circle = new Circle(50);
        circle.setFill(new Color(0.3, 0.4, 0.55, 0.44));
        //circle.centerXProperty().bind(root.widthProperty().divide(2));
        //circle.centerYProperty().bind(root.heightProperty().divide(2));

        Label label = new Label("JavaFX");

        Font font = Font.font("Haettenschweiler", FontWeight.BOLD, FontPosture.REGULAR, 15);
        label.setFont(font);
        root.getChildren().addAll(circle, label);

        Scene scene = new Scene(root, 300, 350);
        primaryStage.setTitle("Label");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
