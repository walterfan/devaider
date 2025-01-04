package com.github.walterfan.devaider.dao;

import lombok.Data;

@Data
public class TagEntity extends BaseEntity {
    private String id; // UUID
    private String name;
}
