package com.company.ppp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|name")
@Table(name = "PPP_FIRST")
@Entity(name = "ppp$First")
public class First extends StandardEntity {
    private static final long serialVersionUID = 5648875835104638864L;

    @Column(name = "NAME")
    protected String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAT_ID")
    protected Two cat;

    public void setCat(Two cat) {
        this.cat = cat;
    }

    public Two getCat() {
        return cat;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}