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
package org.lorislab.smonitor.gwt.uc.form.item;

import org.lorislab.smonitor.gwt.uc.form.cell.ListCell;
import java.util.List;

/**
 * The list form item.
 * @author Andrej Petras <andrej@ajka-andrej.com>
 * @param <T> the entity.
 */
public abstract class ListFormItem<T> extends AbstractFormItem<T, List<String>, List<String>> {
        /**
     * The default constructor.
     */
    public ListFormItem() {
        super(new ListCell());
    }
}