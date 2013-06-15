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
package org.lorislab.smonitor.gwt.uc.table;

import org.lorislab.smonitor.gwt.uc.ConstantValues;
import org.lorislab.smonitor.gwt.uc.table.column.AbstractEntityColumn;
import org.lorislab.smonitor.gwt.uc.table.handler.ColumnSortHandler;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.view.client.ListDataProvider;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public class EntityDataGrid<T> extends DataGrid<T> {

    private ListDataProvider<T> dataProvider;

    public EntityDataGrid() {
        dataProvider = new ListDataProvider<T>();
        dataProvider.addDataDisplay(this);
        setEmptyTableWidget(new Label("Empty"));

        setAutoHeaderRefreshDisabled(true);
        setAutoFooterRefreshDisabled(true);
    }

    public void reset() {
        dataProvider.getList().clear();
    }

    public void add(T data) {
        dataProvider.getList().add(data);
        dataProvider.flush();
    }

    public void addAll(List<T> data) {
        dataProvider.getList().addAll(data);
        dataProvider.flush();
    }

    public void refresh() {
        dataProvider.refresh();
    }
    
    public void update(T data) {
        if (data != null) {
            int index = dataProvider.getList().indexOf(data);
            if (index != -1) {
                dataProvider.getList().set(index, data);
                dataProvider.flush();
            }
        }
    }

    public void remove(T data) {
        if (data != null) {
            dataProvider.getList().remove(data);
            dataProvider.flush();
        }
    }

    public void remove(FilterItem<T> filter) {
        T item = find(filter);
        if (item != null) {
            remove(item);
        }
    }
    
    public T get(int index) {
        return dataProvider.getList().get(index);
    }
    
    public List<T> get() {
        return dataProvider.getList();
    }
    
    public T find(FilterItem<T> filter) {
        T result = null;
        if (filter != null) {
            List<T> items = dataProvider.getList();
            if (items != null && !items.isEmpty()) {
                Iterator<T> iter = items.iterator();
                while (result == null && iter.hasNext()) {
                    result = filter.isItem(iter.next());
                }
            }
        }
        return result;
    }

    public Column<T, ?> addColumn(String name, AbstractEntityColumn<T, ?, ?> column) {
        return addColumn(name, false, column);
    }

    public <K extends Comparable<K>> Column<T, ?> addColumn(String name, boolean sorting, final AbstractEntityColumn<T, K, ?> column) {
        addColumn(column, name);
        if (sorting) {
            addColumnSortHandler(new ColumnSortHandler<T>(dataProvider.getList(), column));
        }
        return column;
    }

    public interface FilterItem<T> {

        public T isItem(T item);
    }
}
