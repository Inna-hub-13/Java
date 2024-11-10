package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;

import java.lang.reflect.Type;


public class Hangman1417 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new HangmanSketch(), 550, 450);

        primaryStage.setTitle("Hangman 1417");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class HangmanSketch extends Pane{

    public final static double a = 25;
    public void paint() {

        getChildren().clear();
        Color color = Color.color(Math.random(), Math.random(), Math.random());
        Line l1 = new Line(getWidth() * 0.32, a, getWidth() * 0.32, getHeight() - a * 5);
        l1.setStroke(color);
        l1.setStrokeWidth(3);
        double l1Length = l1.getEndY() - l1.getStartY();

        Line l2 = new Line(getWidth() * 0.32, a, getWidth() * 0.56, a);
        l2.setStroke(color);
        l2.setStrokeWidth(3);

        Line l3 = new Line(l2.getEndX(), a, l2.getEndX(),  l1Length * 0.65);
        l3.setStroke(color);
        l3.setStrokeWidth(3);

        Line leftLeg = new Line(l3.getEndX(), l3.getEndY(), l3.getEndX() - l1Length * 0.20, l3.getEndY() + l1Length * 0.20);
        leftLeg.setStroke(color);
        leftLeg.setStrokeWidth(3);

        Line rightLeg = new Line(l3.getEndX(), l3.getEndY(), l3.getEndX() + l1Length * 0.20, l3.getEndY() + l1Length * 0.20);
        rightLeg.setStroke(color);
        rightLeg.setStrokeWidth(3);

        Line leftArm = new Line(l3.getStartX(), l3.getStartY() + l1Length * 0.3,
                l3.getStartX() - l1Length * 0.20, l3.getStartY() + l1Length * 0.50);
        leftArm.setStroke(color);
        leftArm.setStrokeWidth(3);

        Line rightArm = new Line(l3.getStartX(), l3.getStartY() + l1Length * 0.3,
                l3.getStartX() + l1Length * 0.20, l3.getStartY() + l1Length * 0.50);
        rightArm.setStroke(color);
        rightArm.setStrokeWidth(3);

        Circle head = new Circle(rightArm.getStartX(), rightArm.getStartY(), l1Length * 0.1);
        head.setFill(Color.WHITE);
        head.setStroke(color);
        head.setStrokeWidth(3);

        Arc base = new Arc(l1.getEndX(), l1.getEndY() + a, head.getRadius(), a, 0, 180);
        base.setStroke(color);
        base.setFill(Color.WHITE);
        base.setStrokeWidth(3);
        base.setType(ArcType.OPEN);

        getChildren().addAll(l1, l2, l3, leftLeg, rightLeg, leftArm, rightArm, head, base);
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
