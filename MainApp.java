// version 3
package com.example.cryptobot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main application class for the Crypto Trading Analysis Bot.
 * This class sets up the primary JavaFX stage, loads the FXML UI,
 * and applies the CSS stylesheet.
 */
public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file for the main user interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
        Scene scene = new Scene(loader.load());

        // Load and apply the CSS stylesheet for styling the UI
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());

        // Set the scene to the stage and display the window
        stage.setScene(scene);
        stage.setTitle("Crypto Trading Analysis Bot"); // Set window title
        stage.show(); // Show the primary stage
    }

    /**
     * Main method to launch the JavaFX application.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        launch(args);
    }
}


