package com.github.walterfan.devaider.domain;

import java.util.Set;
import java.util.Map;
import lombok.Data;

@Data
public class Prompt {
    private String name;
    private String desc;
    private String systemPrompt;
    private String userPrompt;
    private String additionalPrompt;
    private Set<String> tags;
    private Map<String, String> variables;

}
