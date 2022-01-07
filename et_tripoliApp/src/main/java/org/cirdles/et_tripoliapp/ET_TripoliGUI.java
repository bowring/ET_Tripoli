/*
 * Copyright 2022 James F. Bowring and CIRDLES.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cirdles.et_tripoliapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

import java.io.IOException;

/**
 * @author James F. Bowring
 */
public class ET_TripoliGUI extends Application {

    public static final String ET_Tripoli_LOGO_SANS_TEXT_URL = "org/cirdles/et_tripoliapp/images/Tripoli2009.png";
    public static Window primaryStageWindow;
    protected static Stage primaryStage;

    public static void updateStageTitle(String fileName) {
        String fileSpec = "[Project File: NONE]";
        fileSpec = fileName.length() > 0 ? fileSpec.replace("NONE", fileName) : fileSpec;
        primaryStage.setTitle("ET_Tripoli  " + fileSpec);
        ET_TripoliGUIController.projectFileName = fileName;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        ET_TripoliGUI.primaryStage = primaryStage;
        Parent root = new AnchorPane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(ET_Tripoli_LOGO_SANS_TEXT_URL));
        updateStageTitle("");

        // this produces non-null window after .show()
        primaryStageWindow = primaryStage.getScene().getWindow();

        primaryStage.setOnCloseRequest((WindowEvent e) -> {
            Platform.exit();
            System.exit(0);
        });

        // postpone loading to allow for stage creation and use in controller
        FXMLLoader loader = new FXMLLoader(ET_TripoliGUI.class.getResource("ET_TripoliGUIController.fxml"));
        scene.setRoot(loader.load());
        scene.setUserData(loader.getController());
        primaryStage.show();
        primaryStage.setMinHeight(scene.getHeight() + 15);
        primaryStage.setMinWidth(scene.getWidth());

    }
}