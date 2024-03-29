package com.example.shopfiy.helper;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmAlert {
    public boolean response;
    public boolean displayAlert(String title,String message){
        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label=new Label();
        label.setText(message);
        Button yesButton=new Button("Yes");
        Button noButton=new Button("No");
        yesButton.setOnAction(e -> {
            response=true;
            window.close();
        });
        noButton.setOnAction(e ->{
            response=false;
            window.close();
        });
        VBox layout=new VBox(10);
        layout.getChildren().addAll(label,yesButton,noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        return response;
    }
}
