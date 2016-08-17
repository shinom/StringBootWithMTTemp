package com.example.model.master;

import com.example.model.BaseObject;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Role extends BaseObject {
    @Column(length = 64)
    private String description;

    public Role merge(Role role) {
        super.merge(role);
        this.description = role.description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
