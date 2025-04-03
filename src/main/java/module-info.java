module co.edu.uniquindio.reproductorvideofx.reproductorvideo {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.reproductorvideofx to javafx.fxml;
    exports co.edu.uniquindio.reproductorvideofx;

    opens co.edu.uniquindio.reproductorvideofx.reproductorvideo.ViewController;
    exports co.edu.uniquindio.reproductorvideofx.reproductorvideo.ViewController;

    opens co.edu.uniquindio.reproductorvideofx.reproductorvideo.Controller;
    exports co.edu.uniquindio.reproductorvideofx.reproductorvideo.Controller;

    opens co.edu.uniquindio.reproductorvideofx.reproductorvideo.Facade;
    exports co.edu.uniquindio.reproductorvideofx.reproductorvideo.Facade;


}