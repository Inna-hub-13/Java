package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

    @Override
    public void start(Stage primaryStage) {

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10, 10, 13, 13));
        root.setHgap(5);
        root.setVgap(10);

        root.getChildren().addAll(new Label("First Name:"),
                new TextField(), new Label("MI"));

        TextField txf = new TextField();
        txf.setPromptText("MI");
        txf.setPrefColumnCount(2);

        root.getChildren().addAll(txf, new Label("Last Name:"), new TextField());

        Scene scene = new Scene(root, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.show();
    }
}
