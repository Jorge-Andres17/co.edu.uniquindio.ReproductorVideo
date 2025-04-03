package co.edu.uniquindio.reproductorvideofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VideoWithFacade extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VideoWithFacade.class.getResource("ReproductorVideo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Reproductor de Video");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}