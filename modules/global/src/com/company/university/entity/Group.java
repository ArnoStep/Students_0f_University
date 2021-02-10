package com.company.university.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERSITY_GROUP")
@Entity(name = "university_Group")
@NamePattern("%s|number")
public class Group extends StandardEntity {
    private static final long serialVersionUID = 1325326651494999405L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private String number;

    @NotNull
    @Column(name = "FACULTY", nullable = false)
    private String faculty;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}