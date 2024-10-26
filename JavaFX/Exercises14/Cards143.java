package com.example.thirtheenthsteps;

import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Cards143 extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox hBox = new HBox();
        ArrayList<Integer> cards = createArrList(12);
        fillHBox(hBox, cards);

        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void fillHBox(HBox hBox, ArrayList<Integer> cards) {

        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.setStyle("-fx-background-color: #d8c357");
        shuffle(cards);

        hBox.getChildren().clear();
        for(int i = 0; i < 3; i++)
            hBox.getChildren().add(new ImageView(new Image( cards.get(i) + ".png")));
    }

    public static ArrayList<Integer> createArrList(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            list.add(i);

        return list;
    }

    public static void shuffle(ArrayList<Integer> list) {

        int randomPos;
        Integer temp;

        for(int i = 0; i < list.size() / 2; i++) {

            randomPos = (int)(Math.random() * list.size());
            temp = list.get(i);
            list.set(i, list.get(randomPos));
            list.set(randomPos, temp);
        }
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
