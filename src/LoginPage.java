package com.grademanagement;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LoginPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(20);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(50));

        primaryStage.setTitle("Grade Management System");

        Label welcomeLabel = new Label("Welcome to the Grade Management System");
        welcomeLabel.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Label descriptionLabel = new Label("Please sign in to access your dashboard");
        descriptionLabel.setFont(Font.font("Arial", FontWeight.NORMAL, 14));

        Label usernameLabel = new Label("Username or Email");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username or email");

        Label passwordLabel = new Label("Password");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");

        CheckBox rememberMeCheckBox = new CheckBox("Remember me");

        Hyperlink forgotPasswordLink = new Hyperlink("Forgot your password?");

        Button signInButton = new Button("Sign In");
        signInButton.setStyle("-fx-background-color: #007bff; -fx-text-fill: white; -fx-padding: 10px 20px;");

        vBox.getChildren().addAll(welcomeLabel, descriptionLabel, usernameLabel, usernameField, passwordLabel, passwordField, rememberMeCheckBox, forgotPasswordLink, signInButton);

        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color: #f0f0f0;");
        stackPane.getChildren().add(vBox);

        Scene scene = new Scene(stackPane, 400, 400, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
