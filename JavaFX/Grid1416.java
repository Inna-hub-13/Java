package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class Grid1416 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new Grid33(), 600, 400);

        primaryStage.setTitle("Grid 3x3 purple/green");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class Grid33 extends Pane {

    private void paint() {

        getChildren().clear();
        Color color1 = Color.color(0.34, 0.15, 0.56, 0.45);
        Color color2 = Color.color(0.34, 0.85, 0.56, 0.45);
        Line l1 = new Line(getWidth() * 0.33, 0, getWidth() * 0.33, getHeight());
        l1.setStroke(color1);
        l1.setStrokeWidth(3);

        Line l2 = new Line(getWidth() * 0.66, 0, getWidth() * 0.66, getHeight());
        l2.setStroke(color1);
        l2.setStrokeWidth(3);

        Line l3 = new Line(0, getHeight() * 0.33, getWidth(), getHeight() * 0.33);
        l3.setStroke(color2);
        l3.setStrokeWidth(3);

        Line l4 = new Line(0, getHeight() * 0.66, getWidth(), getHeight() * 0.66);
        l4.setStroke(color2);
        l4.setStrokeWidth(3);

        getChildren().addAll(l1, l2, l3, l4);
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
