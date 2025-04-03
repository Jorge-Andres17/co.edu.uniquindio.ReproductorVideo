package co.edu.uniquindio.reproductorvideofx.reproductorvideo.ViewController;

import co.edu.uniquindio.reproductorvideofx.reproductorvideo.Controller.ReproductorController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

import java.io.File;

public class ReproductorViewController {
    ReproductorController reproductorController;

    @FXML
    private Button btn_reproducirArchivo;

    @FXML
    private Button btn_cargarArchivo;

    @FXML
    private TextField txtArchivo;

    @FXML
    private TextArea txtArea_info;

    @FXML
    void onCargarArchivo(ActionEvent event) {
        cargarArchivo();
    }

    @FXML
    void onReproducirArchivo(ActionEvent event) {
        reproducirVideo();
    }

    private void reproducirVideo() {
        String filename = txtArchivo.getText().trim();
        if (!filename.isEmpty()) {
            String resultado = reproductorController.reproducirVideo(filename);
            txtArea_info.setText(resultado);
        } else {
            txtArea_info.setText("Por favor, arrastre o ingrese el nombre del archivo.");
        }
    }

    public String cargarArchivo() {
        btn_cargarArchivo.setOnAction(e ->{
            reproductorController.cargarArchivo();});
        txtArchivo.setOnDragOver(event ->{
            if (event.getGestureSource() != txtArchivo && event.getDragboard().hasFiles()) {
                event.acceptTransferModes(TransferMode.COPY);
            }
            event.consume();
        });
        txtArchivo.setOnDragOver((DragEvent event) ->{
            Dragboard db = event.getDragboard();
            if (db.hasFiles()) {
                File file = db.getFiles().get(0);
                txtArchivo.setText(file.getName());
            }
            event.setDropCompleted(true);
            event.consume();});

        return txtArchivo.getText();
    }

    @FXML
    void initialize() {
        reproductorController = new ReproductorController();
    }

}
