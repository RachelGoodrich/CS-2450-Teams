import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  Recreation of Teams with design updates
 */

public class teams extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label component.
      
      
      Image sidebarpic = new Image("File:sidebarpic.PNG");
      ImageView sidebarview = new ImageView(sidebarpic);
      sidebarview.setPreserveRatio(true);
      
      Image shecodesbuttonpic = new Image("File:shecodesbuttonpic.PNG");
      ImageView shecodesbuttonpicview = new ImageView(shecodesbuttonpic);
      sidebarview.setPreserveRatio(true);

     
      
      Label searchLabel = new Label("search");

    
   

      Button shecodesbutton = new Button();
      shecodesbutton.setGraphic(shecodesbuttonpicview);
      shecodesbutton.setPrefSize(70, 70);
       //Make event handlers for buttons 

       shecodesbutton.setOnAction(event ->
       {         
          
        
       });
        

 

      
      // Create other boxes
      HBox searchBar = new HBox(searchLabel);
      VBox left = new VBox(sidebarview);
      
     
      
     
      
      searchBar.getStyleClass().add("search-bar");
      HBox main = new HBox(shecodesbutton);
      left.getStyleClass().add("left-side");

      // Create a Scene with the VBox as its root node.
      HBox hbox = new HBox(10, left,main);
      VBox vbox = new VBox(searchBar, hbox);
      

      Scene scene = new Scene(vbox);

      // Set stylesheet
      scene.getStylesheets().add("teams.css");
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Teams");
      
      // Show the window.
      primaryStage.show();
   }
}
