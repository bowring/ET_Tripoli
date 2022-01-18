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

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.cirdles.et_tripoli.ET_Tripoli;
import org.cirdles.et_tripoli.gui.utilities.BrowserControl;

public class AboutET_TripoliController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="aboutDetailsLabel"
    private Label aboutDetailsLabel; // Value injected by FXMLLoader

    @FXML // fx:id="buildDate"
    private Label buildDate; // Value injected by FXMLLoader

    @FXML // fx:id="contributorsLabel"
    private Label contributorsLabel; // Value injected by FXMLLoader

    @FXML // fx:id="supportersLabel"
    private Label supportersLabel; // Value injected by FXMLLoader

    @FXML // fx:id="versionText"
    private Label versionText; // Value injected by FXMLLoader

    @FXML
    void visitET_TripoliOnCirdlesAction(ActionEvent event) {
        BrowserControl.showURI("http://cirdles.org/");//projects/et_tripoli/");
    }

    @FXML
    void visitUsOnGithubAction(ActionEvent event) {
        BrowserControl.showURI("https://github.com/CIRDLES/ET_Tripoli");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        versionText.setText("ET_Tripoli v" + ET_Tripoli.VERSION);
        buildDate.setText("Release Date: " + ET_Tripoli.RELEASE_DATE);
        aboutDetailsLabel.setText(ET_Tripoli.ABOUT_WINDOW_CONTENT.toString());
        contributorsLabel.setText(ET_Tripoli.CONTRIBUTORS_CONTENT.toString());
        supportersLabel.setText(ET_Tripoli.SUPPORTERS_CONTENT.toString());
    }

}