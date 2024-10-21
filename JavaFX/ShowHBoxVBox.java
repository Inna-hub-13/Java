package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowHBoxVBox extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        root.setTop(getHbox());
        root.setBottom(getVBox());

        Scene scene = new Scene(root);
        primaryStage.setTitle("ShowHBoxVBox");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private HBox getHbox() {
        HBox hbox = new HBox(14);
        Image img1 = new Image("bg_flag.jpg");
        ImageView imageView = new ImageView(img1);

        hbox.getChildren().addAll(new Button("Computer science"), new Button("Chemistry"), imageView);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setStyle("-fx-background-color: #e3a640");
        return hbox;
    }

    private VBox getVBox() {

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(15, 5, 5, 5));
        vbox.getChildren().add(new Label("Courses: "));

        Label[] courses = new Label[] {new Label("C1200"), new Label("C1036"),
                new Label("C1350"), new Label("C1402")};

        for(Label label : courses) {
            VBox.setMargin(label, new Insets(0, 0, 0, 15));
            vbox.getChildren().add(label);
        }

        return vbox;
    }
}
