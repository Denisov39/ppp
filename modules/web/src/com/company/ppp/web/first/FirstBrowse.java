package com.company.ppp.web.first;

import com.company.ppp.entity.Two;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.GroupDatasource;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FirstBrowse extends AbstractLookup {

    @Inject
    private GroupDatasource firstsDs;
    @Inject
    private CollectionDatasource<Two, UUID> twoesDs;


    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        twoesDs.addItemChangeListener(e -> {
            if (e.getItem() != null) {
                Map<String, Object> qparams = new HashMap<>();
                firstsDs.setQuery("select e from ppp$First e where e.cat.id = :custom$two");
                qparams.put("two", e.getItem().getId());

                firstsDs.refresh(qparams);
            } else {
                firstsDs.setQuery("select e from ppp$First e ");
                firstsDs.refresh();
            }

        });

    }
}