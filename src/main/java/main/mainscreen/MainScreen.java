package main.mainscreen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Part;

import java.io.IOException;

public class MainScreen extends Application {
    public void start (Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
        fxmlLoader.setRoot(new AnchorPane());
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void Main(String[] args){

        // Create sample parts
        //Part part1 = new Part(1,"Engine",4000.0,5,1,3);

    }

}