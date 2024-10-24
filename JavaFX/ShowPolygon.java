package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class ShowPolygon extends Application{

    @Override
    public void start (Stage primaryStage) {

        Scene scene = new Scene(new MyPolygon(), 350, 350);
        primaryStage.setTitle("Show Polygon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyPolygon extends Pane {

    private void paint() {

        Polyline p1 = new Polyline();
        Polygon p2 = new Polygon();

        p1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        p1.setStroke(Color.BLACK);
        p1.setStrokeWidth(4);

        p2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        p2.setStroke(Color.BLACK);
        p2.setStrokeWidth(4);


        ObservableList<Double> list1 = p1.getPoints();
        ObservableList<Double> list2 = p2.getPoints();
        double centerX = getWidth() / 2, centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;

        for(int i = 0; i < 8; i++) {

            list1.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list1.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
            list2.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list2.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }

        p2.setRotate(28);
        getChildren().clear();
        getChildren().addAll(p1, p2);
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