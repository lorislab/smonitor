/*
 * Copyright 2013 Andrej Petras <andrej@ajka-andrej.com>.
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
package com.ajkaandrej.smonitor.admin.client.app.panel;

import com.ajkaandrej.smonitor.admin.client.app.model.ApplicationDetailsModel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;

/**
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public class ApplicationDetailsPanel extends Composite {

    private FlexTable flexTable;

    public ApplicationDetailsPanel() {

        flexTable = new FlexTable();

        initWidget(flexTable);
    }

    public void reset() {
        flexTable.removeAllRows();
    }

    public void add(ApplicationDetailsModel model) {
        int numRows = flexTable.getRowCount();
        flexTable.setWidget(numRows, 0, new ApplicationDetailsPanelItem(model));
    }

}