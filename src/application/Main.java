package application;
import javafx.application.Application;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
 
 
public class Main extends Application {
    
    @Override
    	public void start(Stage stage) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
			stage.setTitle("Qurat's Calculator");
	        Scene scene = new Scene(root);
	        
	        stage.setScene(scene);
	        stage.show();
		/*} catch(Exception e) {
			e.printStackTrace();
		}*/
	}
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

 

