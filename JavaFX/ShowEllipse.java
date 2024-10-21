package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

public class ShowEllipse extends Application {

    @Override
    public void start(Stage primaryStage) {

        MyEllipse myEllipsePane = new MyEllipse();
        myEllipsePane.setStyle("-fx-background-color: #95b2c2");


        Scene scene = new Scene(myEllipsePane, 450, 500);
        primaryStage.setTitle("Show Ellipses");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class MyEllipse extends Pane {

        private void paint(){

            getChildren().clear();
            for (int i = 0; i < 50; i++) {
                Ellipse ellipse = new Ellipse(getWidth() / 2, getHeight() / 2, 150, 50.2);
                ellipse.setStroke(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
                ellipse.setStrokeWidth(6);
                ellipse.setFill(null);
                ellipse.setRotate(i * 360 / 48);
                //ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
                //ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
                getChildren().add(ellipse);
            }
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

}
