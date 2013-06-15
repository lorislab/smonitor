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
package org.lorislab.smonitor.gwt.uc;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.UIObject;

/**
 * The GWT constants.
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public final class ConstantValues {

    /**
     * The target blank.
     */
    public static final String TARGET_BLANK = "_blank";
    /**
     * The div tag.
     */
    public static final String HTML_TAG_DIV = "<div/>";
    /**
     * The date pattern.
     */
    public static final String DATE_PATTERN = "dd.MM.yyyy HH:mm:ss";
    /**
     * The date time format.
     */
    public static final DateTimeFormat DATE_FORMAT = DateTimeFormat.getFormat(DATE_PATTERN);

    public static final String EVENT_MOUSEOVER = "mouseover";
    
    public static final String EVENT_MOUSEOUT = "mouseout";
    
    /**
     * The private constructor.
     */
    private ConstantValues() {
        // empty constructor
    }

}
