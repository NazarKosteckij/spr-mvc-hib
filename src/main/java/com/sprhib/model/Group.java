package com.sprhib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by nkostets on 6/8/2015.
 */
@Entity
@Table(name="Groups")
public class Group {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public Group(){}

    public Group(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
