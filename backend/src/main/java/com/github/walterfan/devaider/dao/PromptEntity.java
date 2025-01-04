package com.github.walterfan.devaider.dao;

/**
 * @author walter
 */
import lombok.Data;
import java.util.Set;
import java.util.Map;

@Data
public class PromptEntity {
    private String id; // UUID
    private String name;
    private String description;
    private String systemPrompt;
    private String userPrompt;
    private String additionalPrompt;
    private Set<TagEntity> tags; // Many-to-Many
    private Map<String, String> variables; // One-to-Many
}
