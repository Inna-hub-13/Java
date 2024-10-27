package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class SmileyFace1411 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new SmileyFace(), 450, 500);
        primaryStage.setTitle("Smile More");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class SmileyFace extends Pane {

    private void paint() {

        getChildren().clear();

        Color color = Color.color(Math.random(), Math.random(), Math.random());
        Circle circle = new Circle(getWidth() / 2, getHeight() / 2, getWidth() * 0.4);
        circle.setFill(null);
        circle.setStroke(color);
        circle.setStrokeWidth(3);

        Arc arc = new Arc(circle.getCenterX(), circle.getCenterY() + 60,
                circle.getRadius() * 0.15, circle.getRadius() * 0.1, 180, 180);
        arc.setFill(Color.WHITE);
        arc.setStroke(color);
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(3);

        Ellipse el1 = new Ellipse(circle.getCenterX() - 50, circle.getCenterY() - 50,
                circle.getRadius() * 0.06, circle.getRadius() * 0.05);

        el1.setFill(Color.BLACK);

        Ellipse el2 = new Ellipse(circle.getCenterX() + 50, circle.getCenterY() - 50,
                circle.getRadius() * 0.06, circle.getRadius() * 0.05);

        el2.setFill(Color.BLACK);

        Ellipse el3 = new Ellipse(circle.getCenterX() - 50, circle.getCenterY() - 50,
                circle.getRadius() * 0.11, circle.getRadius() * 0.09);

        el3.setFill(null);
        el3.setStroke(color);
        el3.setStrokeWidth(3);

        Ellipse el4 = new Ellipse(circle.getCenterX() + 50, circle.getCenterY() - 50,
                circle.getRadius() * 0.11, circle.getRadius() * 0.09);

        el4.setFill(null);
        el4.setStroke(color);
        el4.setStrokeWidth(3);


        Polygon polygon = new Polygon(circle.getCenterX(), circle.getCenterY() - 15,
                circle.getCenterX() + 30, circle.getCenterY() + 45,
                circle.getCenterX() - 30, circle.getCenterY() + 45);
        polygon.setFill(null);
        polygon.setStroke(color);
        polygon.setStrokeWidth(3);

        getChildren().add(arc);
        getChildren().add(el1);
        getChildren().add(el2);
        getChildren().add(el3);
        getChildren().add(el4);
        getChildren().add(polygon);
        getChildren().add(circle);
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
