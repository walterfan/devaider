package com.github.walterfan.devaider.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.walterfan.devaider.domain.Prompt;
import com.github.walterfan.devaider.service.PromptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PromptController {
    private final PromptService promptService;

    @Autowired
    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }

    @GetMapping("/prompts")
    public List<Prompt> getAllPrompts() {
        return promptService.findAll();
    }

    @GetMapping("/prompts/{id}")
    public Prompt getPrompt(@PathVariable String id) {
        return promptService.findById(id).orElseThrow();
    }

    @PostMapping("/prompts")
    public Prompt createPrompt(@RequestBody Prompt prompt) {
        return promptService.save(prompt);
    }

    @PutMapping("/prompts/{id}")
    public Prompt updatePrompt(@PathVariable String id, @RequestBody Prompt prompt) {
        Prompt existingPrompt = getPrompt(id);
        existingPrompt.setName(prompt.getName());
        existingPrompt.setDesc(prompt.getDesc());
        existingPrompt.setSystemPrompt(prompt.getSystemPrompt());
        existingPrompt.setUserPrompt(prompt.getUserPrompt());
        existingPrompt.setAdditionalPrompt(prompt.getAdditionalPrompt());
        existingPrompt.setVariables(prompt.getVariables());
        existingPrompt.setTags(prompt.getTags());
        return promptService.save(existingPrompt);
    }

    @DeleteMapping("/prompts/{id}")
    public void deletePrompt(@PathVariable String id) {
        promptService.deleteById(id);
    }
}
