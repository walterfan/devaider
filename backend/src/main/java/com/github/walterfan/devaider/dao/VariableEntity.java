package com.github.walterfan.devaider.dao;

import lombok.Data;

@Data
public class VariableEntity extends BaseEntity {
    private String id; // UUID
    private String promptId;
    private String key;
    private String value;
}
