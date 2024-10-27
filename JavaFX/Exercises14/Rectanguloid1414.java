package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rectanguloid1414 extends Application{

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new RecPane(), 450, 550);

        primaryStage.setTitle("Rectangles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class RecPane extends Pane {

    private void paint() {

        getChildren().clear();
        Color color = Color.color(Math.random(), Math.random(), Math.random());
        Color colorExtra = Color.color(Math.random(), Math.random(), Math.random());

        Rectangle rec1 = new Rectangle(getWidth() * 0.25, getHeight() * 0.3,
                getWidth() * 0.4 + 100, getHeight() * 0.3);
        rec1.setFill(null);
        rec1.setStroke(color);
        rec1.setStrokeWidth(3);

        Rectangle rec2 = new Rectangle(getWidth() * 0.25 - 40, getHeight() * 0.3 + 50,
                getWidth() * 0.4 + 100, getHeight() * 0.3);
        rec2.setFill(null);
        rec2.setStroke(color);
        rec2.setStrokeWidth(3);

        Polygon p1 = new Polygon(rec1.getX() + rec1.getWidth(), rec1.getY(),
                rec2.getX() + rec2.getWidth(), rec2.getY(),
                rec2.getX() + rec2.getWidth(), rec2.getY() + rec2.getHeight(),
                rec1.getX() + rec1.getWidth(), rec1.getY() + rec1.getHeight());

        p1.setFill(null);
        p1.setStroke(colorExtra);
        p1.setStrokeWidth(3);

        Polygon p2 = new Polygon(rec1.getX(), rec1.getY(),
                rec2.getX(), rec2.getY(),
                rec2.getX(), rec2.getY() + rec2.getHeight(),
                rec1.getX(), rec1.getY() + rec1.getHeight());

        p2.setFill(null);
        p2.setStroke(colorExtra);
        p2.setStrokeWidth(3);

        getChildren().addAll(rec1, rec2, p1, p2);
    }

    @Override
    public void setWidth(double width) {

        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {

        super.setHeight(height);
        paint();
    }
}
