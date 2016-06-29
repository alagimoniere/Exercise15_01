package exercise15_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
        
public class Exercise15_01 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    HBox cards = new HBox();
    GridPane button = new GridPane();
     
    /** Add images */
    for (int i = 1; i < 53; i++) {
        Image image1 = new Image ("images/" + i + ".png");
    }
    
    /** Create array to hold card numbers */
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    for (int i = 1; i < 53; i++) {
        numbers.add(i);
    }
    
    ImageView imageView1 = new ImageView("images/" + numbers.get(0) + ".png");
    ImageView imageView2 = new ImageView("images/" + numbers.get(1) + ".png");
    ImageView imageView3 = new ImageView("images/" + numbers.get(2) + ".png");
    ImageView imageView4 = new ImageView("images/" + numbers.get(3) + ".png");
    
    /** Create button */
    Button refresh = new Button("Refresh");
    
    refresh.setOnAction(e -> {java.util.Collections.shuffle(numbers);
                              cards.getChildren().clear();
                              cards.getChildren().add(new ImageView("images/" + numbers.get(0) + ".png"));
                              cards.getChildren().add(new ImageView("images/" + numbers.get(1) + ".png"));
                              cards.getChildren().add(new ImageView("images/" + numbers.get(2) + ".png"));
                              cards.getChildren().add(new ImageView("images/" + numbers.get(3) + ".png"));
                             }
                        );
                   
    /** Add images and button to pane */
    cards.getChildren().add(imageView1);
    cards.getChildren().add(imageView2);
    cards.getChildren().add(imageView3);
    cards.getChildren().add(imageView4);
    button.getChildren().add(refresh);
    
    /** Set scene */
    BorderPane pane = new BorderPane();
    pane.setCenter(cards);
    pane.setBottom(button);
    button.setHgap(2);
    cards.setAlignment(Pos.CENTER);
    button.setAlignment(Pos.CENTER);
    Scene scene = new Scene(pane, 300, 150);
    primaryStage.setTitle("Exercise15_01");
    primaryStage.setScene(scene);
    primaryStage.show();
    
    }
    
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
