package myEx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class appCreate extends Application implements EventHandler<ActionEvent> {
    TextField textField;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My Super App");
        Label label = new Label("Enter your name");
        Button button = new Button("Click me");
        textField = new TextField("hello");

        VBox vBoxlayout= new VBox();
        //vBoxlayout.getChildren().add(label);
        vBoxlayout.getChildren().add(button);
        //vBoxlayout.getChildren().add(textField);
        //StackPane layout = new StackPane();
        //layout.getChildren().add(button);
        Scene scene = new Scene(vBoxlayout, 1600, 1600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
    }
}
