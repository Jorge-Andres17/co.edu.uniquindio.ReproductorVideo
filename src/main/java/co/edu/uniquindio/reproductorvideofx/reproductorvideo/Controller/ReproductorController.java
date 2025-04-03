package co.edu.uniquindio.reproductorvideofx.reproductorvideo.Controller;

import co.edu.uniquindio.reproductorvideofx.reproductorvideo.Facade.VideoFacade;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class ReproductorController {
    VideoFacade videoFacade;

    public ReproductorController(){
        videoFacade = new VideoFacade();
    }

    public void cargarArchivo() {
        try {
            Runtime.getRuntime().exec("explorer.exe " );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String reproducirVideo(String filename) {
        return videoFacade.reproducirVideo(filename);
    }
}
