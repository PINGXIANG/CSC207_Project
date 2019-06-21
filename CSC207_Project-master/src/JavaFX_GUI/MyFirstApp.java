package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Collections;

public class MyFirstApp extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("I was run before the stage method run");
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Welcome to Patrick's JavaFX");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);

        Text sceneTitle = new Text("Welcome!");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn1 = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn1);
        grid.add(hbBtn, 1, 4);

        Button btn2 = new Button("Sign up");
        VBox vbBtn = new VBox(20);
        vbBtn.setAlignment(Pos.BOTTOM_CENTER);
        vbBtn.getChildren().add(btn2);
        grid.add(vbBtn,2,4);

        /*
        Handle an event
        */
        Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                actionTarget.setFill(Color.FUCHSIA);
                actionTarget.setText("Sign in button pressed");
            }
        });

        primaryStage.show();
            }

    @Override
    public void stop() throws Exception {
        System.out.println("I was run before the stage method run");
        super.stop();
    }
}
