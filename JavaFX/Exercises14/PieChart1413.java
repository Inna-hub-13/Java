package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.control.Label;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;

public class PieChart1413 extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        fillPane(root, 100);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Pie Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void fillPane(StackPane pane, double radius) {

        Group group = new Group();
        Arc arc1 = new Arc(pane.getWidth() / 2, pane.getHeight() / 2,
                radius, radius, 0, 360 * 0.2);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(pane.getWidth() / 2, pane.getHeight() / 2,
                radius, radius, arc1.getLength(), 360 * 0.1);
        arc2.setFill(Color.BLUE);
        arc2.setType(ArcType.ROUND);

        Arc arc3 = new Arc(pane.getWidth() / 2, pane.getHeight() / 2,
                radius, radius, arc2.getLength() + arc1.getLength(), 360 * 0.3);
        arc3.setFill(Color.GREEN);
        arc3.setType(ArcType.ROUND);

        Arc arc4 = new Arc(pane.getWidth() / 2, pane.getHeight() / 2,
                radius, radius, arc2.getLength() + arc1.getLength() + arc3.getLength() , 360 * 0.4);
        arc4.setFill(Color.YELLOW);
        arc4.setType(ArcType.ROUND);

        Label lb2 = new Label("Quiz -- 10%");
        lb2.setLayoutX(arc2.getCenterX() - 40);
        lb2.setLayoutY(arc2.getCenterY() - 115);
        Label lb1 = new Label("Project -- 20%");
        lb1.setLayoutX(arc1.getCenterX() + 60);
        lb1.setLayoutY(arc1.getCenterY() - 80);
        Label lb3 = new Label("Midterm -- 30%");
        lb3.setLayoutX(arc1.getCenterX() - 170);
        lb3.setLayoutY(arc1.getCenterY() + 10);
        Label lb4 = new Label("Final -- 40%");
        lb4.setLayoutX(arc1.getCenterX() - 50);
        lb4.setLayoutY(arc1.getCenterY() + 70);

        group.getChildren().addAll(arc1, arc2, arc3, arc4, lb1, lb2, lb3, lb4);
        pane.getChildren().add(group);
    }
}
