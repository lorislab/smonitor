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
package org.lorislab.smonitor.admin.client.app.panel;

import org.lorislab.smonitor.gwt.uc.ConstantValues;
import org.lorislab.smonitor.gwt.uc.form.EntityForm;
import org.lorislab.smonitor.gwt.uc.form.HeaderForm;
import org.lorislab.smonitor.gwt.uc.form.item.BooleanFormItem;
import org.lorislab.smonitor.gwt.uc.form.item.DateFormItem;
import org.lorislab.smonitor.gwt.uc.form.item.IntegerFormItem;
import org.lorislab.smonitor.gwt.uc.form.item.TextFormItem;
import org.lorislab.smonitor.admin.client.app.model.ApplicationDetailsModel;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import java.util.Date;

/**
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public class ApplicationDetailsPanelItem extends EntityForm<ApplicationDetailsModel> {

    public ApplicationDetailsPanelItem() {
        super(3);
        setStyleName("applicationDetailsPanelItem");
        addHeader(new HeaderForm<ApplicationDetailsModel, Anchor>() {
            @Override
            public Anchor getWidget(ApplicationDetailsModel object, Anchor anchor) {
                Anchor result = anchor;
                if (data != null) {
                    String url = data.scheme + "://" + data.hostName + ":" + data.hostPort + data.context;
                    if (result == null) {
                        result = new Anchor(url, url, ConstantValues.TARGET_BLANK);
                    } else {
                        result.setText(url);
                        result.setHref(url);
                    }
                }
                return result;
            }
        }, HasHorizontalAlignment.ALIGN_CENTER);
        setHeaderStyleName("applicationDetailsPanelItemHeader");
                
        addCell("Id:", new TextFormItem<ApplicationDetailsModel>() {
            @Override
            public String getObject(ApplicationDetailsModel object) {
                return object.id;
            }
        });
        addCell("Name:", new TextFormItem<ApplicationDetailsModel>() {
            @Override
            public String getObject(ApplicationDetailsModel object) {
                return object.name;
            }
        });
        addCell("Host:", new TextFormItem<ApplicationDetailsModel>() {
            @Override
            public String getObject(ApplicationDetailsModel object) {
                return object.host;
            }
        });

        addCell("Active sessions:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.activeSessions;
            }
        });
        addCell("Distributable:", new BooleanFormItem<ApplicationDetailsModel>() {
            @Override
            public Boolean getObject(ApplicationDetailsModel object) {
                return object.distributable;
            }
        });
        addCell("Expired sessions:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.expiredSessions;
            }
        });

        addCell("Max active sessions:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.maxActive;
            }
        });
        addCell("Max inactive interval:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.maxInactiveInterval;
            }
        });
        addCell("Rejected sessions:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.rejectedSessions;
            }
        });

        addCell("Session avg. alive time:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.sessionAverageAliveTime;
            }
        });
        addCell("Session counter:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.sessionCounter;
            }
        });
        addCell("Session id length:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.sessionIdLength;
            }
        });

        addCell("Session max alive time:", new IntegerFormItem<ApplicationDetailsModel>() {
            @Override
            public Integer getObject(ApplicationDetailsModel object) {
                return object.sessionMaxAliveTime;
            }
        });
        addCell("Context:", new TextFormItem<ApplicationDetailsModel>() {
            @Override
            public String getObject(ApplicationDetailsModel object) {
                return object.context;
            }
        });
        addCell("Start time:", new DateFormItem<ApplicationDetailsModel>() {
            @Override
            public Date getObject(ApplicationDetailsModel object) {
                return object.startTime;
            }
        });
    }
}