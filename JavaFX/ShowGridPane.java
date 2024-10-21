package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application{

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(5,5,5,5));
        root.setHgap(10);
        root.setVgap(5);

        TextField tffn = new TextField();
        TextField tfmi = new TextField();
        TextField tfln = new TextField();

        Label l1 = new Label("First Name:");
        Label l2 = new Label("MI: ");
        Label l3 = new Label("Last Name:");
        Button b = new Button("Add name");

        root.add(l1, 0, 0);
        root.add(l2, 0, 1);
        root.add(l3, 0, 2);
        root.add(tffn, 1, 0);
        root.add(tfmi, 1, 1);
        root.add(tfln, 1, 2);
        root.add(b, 1, 3);
        GridPane.setHalignment(b, HPos.RIGHT);

        Scene scene = new Scene(root, 450, 450);
        primaryStage.setTitle("Show GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
