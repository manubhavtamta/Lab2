
import javafx.application.Application;

import javafx.collections.ObservableList;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.geometry.Insets;

import javafx.geometry.Pos;

import javafx.scene.Node;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.stage.Stage;

import javafx.scene.layout.VBox;

import javafx.scene.layout.HBox;

public class FXMainPane extends VBox

{

     public void start(Stage stage)

     {     

         

          HBox hb1=new HBox();

          HBox hb2=new HBox();    

//create object for the class DataManager

          DataManager Dobject=new DataManager();

          //textField create

          TextField textFields = new TextField();     

          //label creation

          Label labelVal = new Label("FeedBack:");

          // hello button

          Button bb1 = new Button("Hello");

          //implement the button bb1

          bb1.setOnAction(new EventHandler<ActionEvent>()

          {

              @Override public void handle(ActionEvent e)

              {        

                    textFields.setText(Dobject.getHello());    

              }

          });

          // howdy button

          Button bb2 = new Button("Howdy");

          //implement the button bb2

          bb2.setOnAction(new EventHandler<ActionEvent>()

          {

              @Override public void handle(ActionEvent e)

              {        

              textFields.setText(Dobject.getHowdy());

              }

          });

          // chinese button

          Button bb3 = new Button("Chinese");

          //implement the button bb3

          bb3.setOnAction(new EventHandler<ActionEvent>()

          {

              @Override public void handle(ActionEvent e)

              {

              textFields.setText(Dobject.getChineese());

              }

          });

          // clear button    

          Button bb4 = new Button("Clear");

          //implement the button bb4

          bb4.setOnAction(new EventHandler<ActionEvent>()

          {

              @Override public void handle(ActionEvent e)

              {

              textFields.setText(" ");

              }

          });

          // exit button     

          Button bb5 = new Button("Exit");

          //implement the button bb5

          bb5.setOnAction(new EventHandler<ActionEvent>()

          {

              @Override public void handle(ActionEvent e)

              {

             

              System.exit(0);

              }

          });

          //Instantiating the HBox class

          VBox vBox =new VBox(50);

          vBox.setAlignment(Pos.CENTER);

          Insets inset=new Insets(20, 20, 20, 20);

          //set the spacing

          vBox.setSpacing(10);

          //sets the margin of nodes

          VBox.setMargin(textFields, new Insets(20, 20, 20, 20));

          //sets the b1

          VBox.setMargin(bb1, new Insets(20, 20, 20, 20));

          //sets the b2

          VBox.setMargin(bb2, new Insets(20, 20, 20, 20));

          //sets the b3

          VBox.setMargin(bb3, new Insets(20, 20, 20, 20));

          //sets the b4

          VBox.setMargin(bb4, new Insets(20, 20, 20, 20));

          //set the b5

          VBox.setMargin(bb5, new Insets(20, 20, 20, 20));

          hb1.setAlignment(Pos.CENTER);

          hb1.getChildren().addAll(labelVal,textFields,hb2);

         

          //vBox retrieval list

          ObservableList<Node> listVal = vBox.getChildren();

          //includes the additional list

          listVal.addAll(textFields, bb1,bb2,bb3,bb4,bb5,hb1);     

    

          //scene object

          Scene scenes = new Scene(vBox);

          //set the scenes

          stage.setScene(scenes);

          //Stage contents

          stage.show();

     }

}  