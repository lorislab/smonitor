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

import com.ajkaandrej.gwt.uc.form.EntityForm;
import com.ajkaandrej.gwt.uc.form.item.BooleanFormItem;
import com.ajkaandrej.gwt.uc.form.item.DateFormItem;
import com.ajkaandrej.gwt.uc.form.item.DoubleFormItem;
import com.ajkaandrej.gwt.uc.form.item.IntegerFormItem;
import com.ajkaandrej.gwt.uc.form.item.ListFormItem;
import com.ajkaandrej.gwt.uc.form.item.TextFormItem;
import com.ajkaandrej.smonitor.admin.client.app.model.SessionDetailsModel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public class SessionDetailsPanel extends EntityForm<SessionDetailsModel> {

    public SessionDetailsPanel() {
        super(4);

        addCell("Id:", new TextFormItem<SessionDetailsModel>() {
            @Override
            public String getObject(SessionDetailsModel object) {
                return object.id;
            }
        });
        addCell("User:", new TextFormItem<SessionDetailsModel>() {
            @Override
            public String getObject(SessionDetailsModel object) {
                return object.user;
            }
        });
        addCell("Valid:", new BooleanFormItem<SessionDetailsModel>() {
            @Override
            public Boolean getObject(SessionDetailsModel object) {
                return object.valid;
            }
        });
        addCell("New:", new BooleanFormItem<SessionDetailsModel>() {
            @Override
            public Boolean getObject(SessionDetailsModel object) {
                return object.newSession;
            }
        });

        addCell("Host name:", new TextFormItem<SessionDetailsModel>() {
            @Override
            public String getObject(SessionDetailsModel object) {
                return object.hostName;
            }
        });
        addCell("Port:", new IntegerFormItem<SessionDetailsModel>() {
            @Override
            public Integer getObject(SessionDetailsModel object) {
                return object.hostPort;
            }
        });
        addCell("Host:", new TextFormItem<SessionDetailsModel>() {
            @Override
            public String getObject(SessionDetailsModel object) {
                return object.host;
            }
        });
        addCell("Application:", new TextFormItem<SessionDetailsModel>() {
            @Override
            public String getObject(SessionDetailsModel object) {
                return object.application;
            }
        });

        addCell("Info:", new TextFormItem<SessionDetailsModel>() {
            @Override
            public String getObject(SessionDetailsModel object) {
                return object.info;
            }
        });
        addCell("Size:", new DoubleFormItem<SessionDetailsModel>() {
            @Override
            public Double getObject(SessionDetailsModel object) {
                return object.size;
            }
        });
        addCell("Ser. size:", new DoubleFormItem<SessionDetailsModel>() {
            @Override
            public Double getObject(SessionDetailsModel object) {
                return object.sizeSerializable;
            }
        });
        addCell("Max inactive:", new IntegerFormItem<SessionDetailsModel>() {
            @Override
            public Integer getObject(SessionDetailsModel object) {
                return object.maxInactiveInterval;
            }
        });

        addCell("Create:", new DateFormItem<SessionDetailsModel>() {
            @Override
            public Date getObject(SessionDetailsModel object) {
                return object.creationTime;
            }
        });
        addCell("Last accessed:", new DateFormItem<SessionDetailsModel>() {
            @Override
            public Date getObject(SessionDetailsModel object) {
                return object.lastAccessedTime;
            }
        });
        addCell("Roles:", new ListFormItem<SessionDetailsModel>() {
            @Override
            public List<String> getObject(SessionDetailsModel object) {
                return object.roles;
            }
        });        
    }
}
