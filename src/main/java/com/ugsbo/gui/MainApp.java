package com.ugsbo.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

/**
 * Runs the main Application and handles the loading of an FXML file.
 */
public class MainApp extends Application {

  /**
   * The main() method is ignored in correctly deployed JavaFX application. main()
   * serves only as fallback in case the application can not be launched through
   * deployment artifacts, e.g., in IDEs with limited FX support. NetBeans ignores
   * main().
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

  /**
   * Starts the Main GUI, will be called from JavaFx.
   */
  @Override
  public void start(Stage stage) {
    createStageFromFXML(stage, "BasicGui");
  }

  /**
   * Loades the FXML file and the Default CSS.
   * 
   * @param stage        The Stage will be passed over from fxml
   * @param fxmlFileName Only the Filename of the fxml file wich sould be loaded
   */
  private void createStageFromFXML(Stage stage, String fxmlFileName) {
    // Gettring the FXML loader to load the File.
    FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName + ".fxml"));
    Parent root;
    // trying to load the FXML and CSS file for the GUI with the fxmlFileName.
    try {
      root = loader.load();
      Scene basicGUI = new Scene(root);
      basicGUI.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
      // Setting the Title of the
      stage.setTitle("Ultra geile Studenten Benutzeroberfläche");
      // set Resizeable to false, in oder to block resizeing though the User.
      stage.setResizable(false);
      stage.setScene(basicGUI);
    } catch (IOException e) {
      System.out.println(".FXML or .css File can not be found.");
      e.printStackTrace();
    }
    stage.show();
  }
}
