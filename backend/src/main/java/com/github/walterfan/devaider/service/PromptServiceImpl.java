package com.github.walterfan.devaider.service;

import com.github.walterfan.devaider.domain.Prompt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromptServiceImpl implements PromptService {
    
    @Override
    public List<Prompt> findAll() {
        return List.of();
    }
    
    @Override
    public Optional<Prompt> findById(String id) {
        return Optional.empty();
    }
    
    @Override
    public Prompt save(Prompt prompt) {
        return null;
    }
    
    @Override
    public void deleteById(String id) {
    
    }
}
