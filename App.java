import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Metric Converter");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label kmLabel = new Label("Kilometers:");
        grid.add(kmLabel, 0, 0);

        TextField kmTextField = new TextField();
        grid.add(kmTextField, 1, 0);

        Button convertKmToMilesBtn = new Button("Convert to Miles");
        grid.add(convertKmToMilesBtn, 2, 0);

        Label milesLabel = new Label("Miles:");
        grid.add(milesLabel, 0, 1);

        TextField milesTextField = new TextField();
        milesTextField.setEditable(false);
        grid.add(milesTextField, 1, 1);

        convertKmToMilesBtn.setOnAction(e -> {
            double kilometers = Double.parseDouble(kmTextField.getText());
            double miles = kilometers * 0.621371;
            milesTextField.setText(String.format("%.2f", miles));
        });

        Label kgLabel = new Label("Kilograms:");
        grid.add(kgLabel, 0, 2);

        TextField kgTextField = new TextField();
        grid.add(kgTextField, 1, 2);

        Button convertKgToPoundsBtn = new Button("Convert to Pounds");
        grid.add(convertKgToPoundsBtn, 2, 2);

        Label poundsLabel = new Label("Pounds:");
        grid.add(poundsLabel, 0, 3);

        TextField poundsTextField = new TextField();
        poundsTextField.setEditable(false);
        grid.add(poundsTextField, 1, 3);

        convertKgToPoundsBtn.setOnAction(e -> {
            double kilograms = Double.parseDouble(kgTextField.getText());
            double pounds = kilograms * 2.20462;
            poundsTextField.setText(String.format("%.2f", pounds));
        });

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


