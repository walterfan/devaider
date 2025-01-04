package com.github.walterfan.devaider.service;

import com.github.walterfan.devaider.domain.Prompt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PromptService {
    List<Prompt> findAll();
    Optional<Prompt> findById(String id);
    Prompt save(Prompt prompt);
    void deleteById(String id);
}
