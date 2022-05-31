package com.gestioneorari;

import com.opencsv.exceptions.CsvValidationException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.opencsv.*
;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {}

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    private static void loadCSV(){
        var fileName = "db/aule.csv";

        try (var fr = new FileReader(fileName, StandardCharsets.UTF_16LE);
             var reader = new CSVReader(fr)) {

            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                for (var e : nextLine) {
                    System.out.printf("%s\n ", e);
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        loadCSV();
        launch();
    }

}