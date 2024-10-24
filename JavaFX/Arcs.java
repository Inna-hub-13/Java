package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class Arcs extends Application{

    @Override
    public void start(Stage primaryStage) {

        Arc arc1 = new Arc(150, 90, 160, 80, 45, 50);
        arc1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(150, 90, 160, 120, 135, 50);
        arc2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);

        Arc arc3 = new Arc(150, 90, 160, 120, 225, 50);
        arc3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);

        Arc arc4 = new Arc(150, 90, 160, 120, 315, 50);
        arc4.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        arc4.setType(ArcType.CHORD);

        Group group = new Group();
        BorderPane root = new BorderPane(group);
        root.setStyle("-fx-background-color: #aa5b94;");
        group.getChildren().addAll(arc1, arc2, arc3, arc4);

        Scene scene = new Scene(root, 350, 350);
        primaryStage.setTitle("Arcs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
