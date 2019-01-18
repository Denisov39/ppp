package com.company.ppp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|category")
@Table(name = "PPP_TWO")
@Entity(name = "ppp$Two")
public class Two extends StandardEntity {
    private static final long serialVersionUID = -7408269279043296453L;

    @Column(name = "CATEGORY")
    protected String category;

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }


}