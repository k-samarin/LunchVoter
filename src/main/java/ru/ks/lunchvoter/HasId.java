package ru.ks.lunchvoter;

import org.springframework.util.Assert;

public interface HasId {

    Integer getId();

    void setId(Integer id);

    default int id() {
        Assert.notNull(getId(), "Entity must has id");
        return getId();
    }
}
