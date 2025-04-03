package co.edu.uniquindio.reproductorvideofx.reproductorvideo.model;

public class VideoFile {
    private String filename;

    public VideoFile() {}

    public VideoFile(String filename) {
        this.filename = filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return filename ;
    }
}
