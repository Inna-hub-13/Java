package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class TextCircle145 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = createSomePane("Welcome to Java");

        Scene scene = new Scene(pane, 350, 350);
        primaryStage.setTitle("Text around circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static Pane createSomePane(String text) {

        Pane pane = new Pane();
        pane.setPadding(new Insets(10, 10, 10, 10));

        Text t1;
        Font f1 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 35);

        double radius = 75;

        for (int i = 0, currentAngle = 0, rotation = 90; i < text.length(); i++, currentAngle += 22, rotation += 22) {

            double x = 105 + radius * Math.cos(Math.toRadians(currentAngle));
            double y = 105 + radius * Math.sin(Math.toRadians(currentAngle));

            t1 = new Text(x, y, String.valueOf(text.charAt(i)));
            t1.setFont(f1);
            t1.setFill(Color.BLACK);
            t1.setRotate(rotation);
            pane.getChildren().add(t1);
        }

        return pane;
    }
}
