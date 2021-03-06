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

package org.cirdles.et_tripoli.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.cirdles.et_tripoli.ET_Tripoli;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author James F. Bowring
 */
public class ET_TripoliGUIController {

    public static String projectFileName;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="versionBuildDate"
    private Label versionBuildDate; // Value injected by FXMLLoader

    @FXML // fx:id="versionLabel"
    private Label versionLabel; // Value injected by FXMLLoader

    @FXML
    void showET_TripoliAbout(ActionEvent event) {
        ET_TripoliGUI.et_TripoliAboutWindow.loadAboutWindow();
    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        versionLabel.setText("v" + ET_Tripoli.VERSION);
        versionBuildDate.setText(ET_Tripoli.RELEASE_DATE);
    }

}