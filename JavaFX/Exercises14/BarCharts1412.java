package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BarCharts1412 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        fillPane(pane, 100, 200);
        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(pane);
        borderPane.setPadding(new Insets(10, 10, 0, 10));

        Scene scene = new Scene(borderPane, 450, 550);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void fillPane(Pane pane, double width, double height) {

        Rectangle rec1 = new Rectangle();
        rec1.setWidth(width);
        rec1.setHeight(height * 0.2);
        rec1.setX(pane.getWidth() / 4);
        rec1.setY(pane.getHeight() - rec1.getHeight());
        rec1.setFill(Color.RED);
        pane.getChildren().add(rec1);

        Rectangle rec2 = new Rectangle();
        rec2.setWidth(width);
        rec2.setHeight(height * 0.1);
        rec2.setX(rec1.getX() + width + 10);
        rec2.setY(pane.getHeight() - rec2.getHeight());
        rec2.setFill(Color.BLUE);
        pane.getChildren().add(rec2);

        Rectangle rec3 = new Rectangle();
        rec3.setWidth(width);
        rec3.setHeight(height * 0.3);
        rec3.setX(rec2.getX() + width + 10);
        rec3.setY(pane.getHeight() - rec3.getHeight());
        rec3.setFill(Color.GREEN);
        pane.getChildren().add(rec3);

        Rectangle rec4 = new Rectangle();
        rec4.setWidth(width);
        rec4.setHeight(height * 0.4);
        rec4.setX(rec3.getX() + width + 10);
        rec4.setY(pane.getHeight() - rec4.getHeight());
        rec4.setFill(Color.YELLOW);
        pane.getChildren().add(rec4);


        Label lb1 = new Label("Project -- 20%");
        lb1.setLayoutX(rec1.getX());
        lb1.setLayoutY(rec1.getY() - 20);
        Label lb2 = new Label("Quiz -- 10%");
        lb2.setLayoutX(rec2.getX());
        lb2.setLayoutY(rec2.getY() - 20);
        Label lb3 = new Label("Midterm -- 30%");
        lb3.setLayoutX(rec3.getX());
        lb3.setLayoutY(rec3.getY() - 20);
        Label lb4 = new Label("Final -- 40%");
        lb4.setLayoutX(rec4.getX());
        lb4.setLayoutY(rec4.getY() - 20);

        pane.getChildren().add(lb1);
        pane.getChildren().add(lb2);
        pane.getChildren().add(lb3);
        pane.getChildren().add(lb4);

    }
}
