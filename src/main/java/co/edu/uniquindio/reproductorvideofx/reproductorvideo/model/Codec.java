package co.edu.uniquindio.reproductorvideofx.reproductorvideo.model;

public class Codec{
    String extension;

    public Codec() {}

    public Codec(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return extension ;
    }
}
