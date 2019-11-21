/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tifanianakayam;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LABKOM01-RPL26
 */
public class TifaniAnakAyam extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        int ayam,kurang;

        System.out.println("Masukkan banyak anak ayam :");
        ayam=sc.nextInt();

        for (kurang=2;kurang<=ayam;){
            System.out.print("Anak ayam turun " +ayam);
            System.out.print(" Mati " +1);
            ayam=ayam-1;
            System.out.println(" Tinggal "+ayam);

            if (ayam==1) {
                System.out.print("Anak Ayam Turun "+ayam);
                System.out.print(", Mati "+ayam);
                System.out.println(", Tinggal Induknya ");
            }
        }
        
        }
    }
    
