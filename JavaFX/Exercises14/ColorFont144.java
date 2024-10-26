package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class ColorFont144 extends Application{

    @Override
    public void start(Stage primaryStage) {

        HBox root = new HBox();
        fillHBox(root, 5, "Java");

        Scene scene = new Scene(root, 500, 150);
        primaryStage.setTitle("Texts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void fillHBox(HBox hBox, int numberOfTexts, String text) {

        hBox.setPadding(new Insets(45, 15, 15, 15));
        hBox.setStyle("-fx-background-color: rgba(223,167,148,0.91);");

        Text t1;
        Font f1 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 35);

        for(int i = 1; i <= numberOfTexts; i++) {

            t1 = new Text(text + " " + i);
            t1.setFont(f1);
            t1.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            t1.setRotate(90);
            hBox.getChildren().add(t1);
        }
    }
}
