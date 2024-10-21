package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        root.setTop(new CustomPane("Top"));
        root.setRight(new CustomPane("Right"));
        root.setLeft(new CustomPane("Left"));
        root.setCenter(new CustomPane("Center"));
        root.setBottom(new CustomPane("Bottom"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public class CustomPane extends StackPane {

        public CustomPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: rgb(170,91,148);");
            setPadding(new Insets(10, 10, 10, 10));
        }
    }
}
