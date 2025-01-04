package com.github.walterfan.devaider.dto;

import lombok.Data;

@Data
public class PromptRequest {
    private String name;
    
    private String desc;
    
    private String category;
    
    private String content;
    
    private String variables;
    
    private String tags;
    
    
}
