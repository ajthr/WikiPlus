package WikiPlus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 737, 531));
        primaryStage.setMinHeight(531.0);
        primaryStage.setMinWidth(737.0);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
