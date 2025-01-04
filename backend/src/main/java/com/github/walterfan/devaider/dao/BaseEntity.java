package com.github.walterfan.devaider.dao;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

/**
 * @author walter
 */
@Getter
@Setter
public class BaseEntity {

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
        this.createTime = new Date();
        this.updateTime = new Date();
    }
    protected String id;
    protected String createdBy;
    protected String updatedBy;
    protected Date createTime;
    protected Date updateTime;
}
