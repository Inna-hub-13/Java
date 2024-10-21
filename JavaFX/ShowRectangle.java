package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class ShowRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {

        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        r2.setFill(Color.BLACK);
        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setFill(Color.BLACK);
        r3.setArcHeight(30);
        r3.setArcWidth(30);

        Group group = new Group();
        group.getChildren().addAll(new Text(10, 27, "r1"), new Text(10, 67, "r2"),
                new Text(10, 107, "r3"), r1, r2, r3);

        for(int i = 0; i < 6; i++) {

            Rectangle r = new Rectangle(100, 50, 100, 30);
            r.setRotate(i * 360 / 10);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            r.setFill(null);
            r.setStrokeWidth(6);
            group.getChildren().add(r);
        }

        group.setScaleX(2);
        group.setScaleY(2);
        Scene scene = new Scene(new BorderPane(group), 500, 500);
        primaryStage.setTitle("Show Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
