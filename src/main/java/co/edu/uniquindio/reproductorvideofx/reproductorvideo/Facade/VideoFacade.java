package co.edu.uniquindio.reproductorvideofx.reproductorvideo.Facade;

import co.edu.uniquindio.reproductorvideofx.reproductorvideo.model.Codec;
import co.edu.uniquindio.reproductorvideofx.reproductorvideo.model.VideoDecoder;
import co.edu.uniquindio.reproductorvideofx.reproductorvideo.model.VideoFile;
import co.edu.uniquindio.reproductorvideofx.reproductorvideo.model.VideoPlayer;
import java.util.ArrayList;
import java.util.List;

public class VideoFacade {
    VideoPlayer videoPlayer;
    VideoFile videoFile;
    VideoDecoder videoDecoder;
    Codec codec;

    public VideoFacade() {
        this.videoPlayer = new VideoPlayer();
        this.videoFile = new VideoFile();
        this.videoDecoder = new VideoDecoder();
        this.codec = new Codec();
    }

    public String reproducirVideo(String filename) {
        List<String> mensajes = new ArrayList<>();

        if (filename == null || filename.isEmpty()) {
            return "Error: Nombre de archivo inválido";
        }
        videoFile.setFilename(filename);
        mensajes.add("Archivo cargado: " + filename);
        codec.setExtension(obtenerExtension(filename));
        mensajes.add("Codec seleccionado: " + codec.getExtension());
        mensajes.add("Decodificando " + filename + " usando: " + codec.getExtension() );
        mensajes.add("Reproduciendo: " + filename + " ....");

        return String.join("\n", mensajes);
    }

    private String obtenerExtension(String filename) {
        int lastDot = filename.lastIndexOf('.');
        if (lastDot == -1) {
            return "";
        }
        return filename.substring(lastDot + 1);
    }
}