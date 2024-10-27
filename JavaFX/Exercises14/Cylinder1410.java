package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Cylinder1410 extends Application {

    @Override
    public void start(Stage primaryStage) {

        CylinderPane cp1 = new CylinderPane();
        Scene scene = new Scene(cp1, 400, 550);

        primaryStage.setTitle("Cylinder 1410");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class CylinderPane extends Pane{

    private void paint(){

        getChildren().clear();

        Ellipse ellipse = new Ellipse(getWidth() / 2, getHeight() / 4, 150, 50.2);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(3);
        ellipse.setFill(Color.WHITE);

        Rectangle rec = new Rectangle(ellipse.getCenterX() - ellipse.getRadiusX(),
                ellipse.getCenterY(), 300, 300);
        rec.setFill(null);
        rec.setStroke(Color.BLACK);
        rec.setStrokeWidth(3);

        Arc arc1 = new Arc(ellipse.getCenterX(), ellipse.getCenterY() + rec.getHeight() - 3,
                ellipse.getRadiusX(), ellipse.getRadiusY() + 10, 180, 180);
        arc1.setFill(null);
        arc1.setStroke(Color.BLACK);
        arc1.setStrokeWidth(3);
        arc1.setFill(Color.WHITE);
        arc1.setType(ArcType.OPEN);

        Arc arc2 = new Arc(ellipse.getCenterX(), ellipse.getCenterY() + rec.getHeight() - 3,
                ellipse.getRadiusX(), ellipse.getRadiusY() + 10, 0, 180);
        arc2.setFill(null);
        arc2.setStroke(Color.BLACK);
        arc2.setStrokeWidth(3);
        arc2.setFill(Color.WHITE);
        arc2.setType(ArcType.OPEN);
        arc2.getStrokeDashArray().addAll(6.0, 21.0);


        getChildren().add(rec);
        getChildren().add(ellipse);
        getChildren().add(arc1);
        getChildren().add(arc2);

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
