/*
 * Copyright 2013 lorislab.org.
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
package org.lorislab.smonitor.gwt.uc.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Iterator;

/**
 *
 * @author Andrej Petras
 */
public class ArrowPopupPanel extends PopupPanel {
//implements HasWidgets{
    
//    protected final AbsolutePanel arrow = new AbsolutePanel();
    
//    @UiField
//    DialogBox popupPanel;
  
//    @UiField
//    PopupPanel panel;
    
    public ArrowPopupPanel() {
//        initWidget(uiBinder.createAndBindUi(this));
        setSize("30px", "70px");
        setStyleName("ui-tooltip-right");
        
        HTML h = new HTML("TEXT<br/>TEXT<br/>TEXT<br/>TEXT<br/>");
        add(h);
    }
    
    public void open(int left, int top) {        
        
//        if (!panel.isShowing()) {
            
            this.setPopupPosition(left-40, top-27);
            this.show();
//            panel.setVisible(true);
//        }
    }
    
    public void close() {
//        this.setVisible(false);
        this.hide();
    }

//    @Override
//    public void add(Widget w) {
//        popupPanel.add(w);
//    }
//
//    @Override
//    public void clear() {
//        popupPanel.clear();
//    }
//
//    @Override
//    public Iterator<Widget> iterator() {
//        return popupPanel.iterator();
//    }
//
//    @Override
//    public boolean remove(Widget w) {
//        return popupPanel.remove(w);
//    }
//    
//    interface MyUiBinder extends UiBinder<Widget, ArrowPopupPanel> {
//    }
//    private static ArrowPopupPanel.MyUiBinder uiBinder = GWT.create(ArrowPopupPanel.MyUiBinder.class);    
}
