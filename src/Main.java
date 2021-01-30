import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    int valueR = 0;
    int valueG = 0;
    int valueB = 0;

    @Override
    public void start(Stage window) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 300);


        Rectangle pv = new Rectangle();
        pv.setWidth(400);
        pv.setHeight(300);
        root.getChildren().add(pv);

        Rectangle hg = new Rectangle();
        hg.setFill(Color.LIGHTGREY);
        hg.setWidth(150);
        hg.setHeight(300);
        root.getChildren().add(hg);

        RadioButton rbRot = new RadioButton("Rot");
        rbRot.setScaleX(1.5);
        rbRot.setScaleY(1.5);
        rbRot.setLayoutX(40);
        rbRot.setLayoutY(50);
        rbRot.setOnAction(event -> {
            if (rbRot.isSelected()) { // erster Klick
                valueR = 255;
                pv.setFill(Color.rgb(valueR, valueG, valueB));
            }
            else {
                valueR = 0;
                pv.setFill(Color.rgb(valueR, valueG, valueB));
            }
        });
        root.getChildren().add(rbRot);

        RadioButton rbGruen = new RadioButton("Gruen");
        rbGruen.setScaleX(1.5);
        rbGruen.setScaleY(1.5);
        rbGruen.setLayoutX(40);
        rbGruen.setLayoutY(130);
        rbGruen.setOnAction(event -> {
            if (rbGruen.isSelected()) { // erster Klick
                valueG = 255;
                pv.setFill(Color.rgb(valueR, valueG, valueB));
            }
            else {
                valueG = 0;
                pv.setFill(Color.rgb(valueR, valueG, valueB));
            }
        });
        root.getChildren().add(rbGruen);

        RadioButton rbBlau = new RadioButton("Blau");
        rbBlau.setScaleX(1.5);
        rbBlau.setScaleY(1.5);
        rbBlau.setLayoutX(40);
        rbBlau.setLayoutY(210);
        rbBlau.setOnAction(event -> {
            if (rbBlau.isSelected()) { // erster Klick
                valueB = 255;
                pv.setFill(Color.rgb(valueR, valueG, valueB));
            }
            else {
                valueB = 0;
                pv.setFill(Color.rgb(valueR, valueG, valueB));
            }
        });
        root.getChildren().add(rbBlau);


        window.setResizable(false);
        window.setTitle("Farbauswahl");
        window.setScene(scene);
        window.show();
    }
}