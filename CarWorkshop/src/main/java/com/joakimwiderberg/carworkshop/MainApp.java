package com.joakimwiderberg.carworkshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Joakim_Widerberg@hotmail.com
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root, 300, 275);
        
        scene.getStylesheets().add("/styles/Styles.css");
        
        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
//        primaryStage.setTitle("CarWorkshop2015");
//        
//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(25, 25, 25, 25));
//        
//        Text scenetitle = new Text("Welcome");
//        scenetitle.setId("welcome-text");
//        grid.add(scenetitle, 0, 0, 2, 1);
//        
//        Label userName = new Label("User Name:");
//        grid.add(userName, 0, 1);
//        
//        TextField userTextField = new TextField();
//        grid.add(userTextField, 1, 1);
//        
//        Label pw = new Label("Password:");
//        grid.add(pw, 0, 2);
//        
//        PasswordField pwbox = new PasswordField();
//        grid.add(pwbox, 1, 2);
//        
//        //grid.setGridLinesVisible(true);
//        
//        Button btn = new Button("Sign in");
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().add(btn);
//        grid.add(hbBtn, 1, 4);
//        
//        final Text actiontarget = new Text();
//        actiontarget.setId("actiontarget");
//        grid.add(actiontarget, 1, 6);
//        
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                actiontarget.setText("Sing in Button pressed");
//            }
//            
//        });
//        
//        Scene scene = new Scene(grid, 300, 275);
//        primaryStage.setScene(scene);
//        
//        scene.getStylesheets().add("/styles/Styles.css");
//        
//        primaryStage.show();
//        
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
