package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class ShowText extends Application{

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        root.setPadding(new Insets(5, 5, 5, 5));
        Font font1 = new Font("Comic Sans MS Bold Italic", 20);

        Text t1 = new Text(20, 20, "Programing is fun");
        t1.setFont(font1);
        t1.setFill(Color.BLACK);

        Text t2 = new Text(60, 60, "Programing is fun\nDisplay text");
        t2.setFont(new Font("Segoe UI Bold Italic", 10));

        Text t3 = new Text(250, 100, "Programing is fun\nDisplay text");
        t3.setStrikethrough(true);
        t3.setStyle("-fx-font-weight: bold; -fx-fill: #cd1126;");

        root.getChildren().addAll(t1, t2, t3);

        Scene scene = new Scene(root);
        root.setStyle("-fx-background-color: #b58ad1;");
        primaryStage.setTitle("ShowText");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
