package application;
//File:    PassChangeGUI.java
//Project: CSIS3101 Assignment #12 
//Author:  Brandon Catalano 
//History: Version 1.0 4/20/22

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;


public class PassChangeGui extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
			
	
			 primaryStage.setTitle("Password Changer");
			 Label ID = new Label("UserID / Email Address");
			 TextField textID = new TextField();
			 Label currentPW = new Label("Current Password");
			 TextField textcurrentPW = new TextField();
			 Label newPW = new Label("New Password");
			 TextField textnewPW = new TextField();
			 Label confirmPW = new Label("Confirm New Password");
			 TextField textconfirmPW = new TextField();
			 Label result = new Label("Result");
			 TextField textresult = new TextField();
			 Button changepass = new Button("Change Password");
			 TilePane tile = new TilePane(ID,textID,currentPW,textcurrentPW,newPW,textnewPW,confirmPW,textconfirmPW, result,textresult,changepass);
			 tile.setHgap(100);
			 tile.setPrefColumns(2);
			 tile.setPadding(new Insets(30,10,100,10));
			
			 
			
			 Scene scene = new Scene(tile);
			 	primaryStage.setScene(scene);
		        primaryStage.setHeight(500);
		        primaryStage.setWidth(500);
		        primaryStage.setResizable(false);
		        primaryStage.setAlwaysOnTop(true);
		        primaryStage.show();
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
