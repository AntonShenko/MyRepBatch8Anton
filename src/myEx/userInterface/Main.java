package myEx.userInterface;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main {
    public static void main(String[] args) {
        System.out.println("privet");
        App app = new App();
        app.go();
    }
}
class App extends Application implements EventHandler<ActionEvent> {
        TextField text;
        public void go (){
            launch();
        }

        @Override
        public void start(Stage primaryStage) throws Exception {

            Button button1=new Button("Click Me");
            Button button2=new Button("Don't Click Me");
            Label label=new Label("Enter your name");
            text=new TextField();
            VBox vBoxlayout=new VBox();
            //StackPane vBoxlayout=new StackPane();
            vBoxlayout.getChildren().add(label);

            button1.setOnAction(this);//добавление слушателей к кнпкам.
            button2.setOnAction(this);

            vBoxlayout.getChildren().add(text);//добавление на лейаут на экране элементв текс.
            vBoxlayout.getChildren().add(button1);//добавление кнопки один на экран.
            vBoxlayout.getChildren().add(button2);

            Scene scene=new Scene(vBoxlayout,600,600);
            primaryStage.setTitle("Next Billion Dollar App");
            primaryStage.setScene(scene);
            primaryStage.show();

        }

        @Override
        public void handle(ActionEvent event) {
            switch (((Button)event.getSource()).getText()){
                case "Click Me":
                    System.out.println("Button 'Click me' was pushed");
                case "Don't Click Me":
                    System.out.println("Button 'Don't Click Me' was pushed");
               }
            }
}



