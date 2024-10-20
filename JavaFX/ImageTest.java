package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ImageTest extends Application{

    @Override
    public void start(Stage primaryStage) {

        Pane root = new HBox(10);
        root.setStyle("-fx-background-color: rgba(176,212,244,0.44); " +
                "-fx-border-color: rgba(182,78,198,0.8)");

        root.setPadding(new Insets(50,50,50,50));
        Image image = new Image("bg_flag.jpg");

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        ImageView imageView1 = new ImageView(image);
        imageView1.setRotate(90);

        root.getChildren().addAll(new ImageView(image), imageView, imageView1);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Bulgarian Flag <3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
