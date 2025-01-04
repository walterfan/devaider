package com.github.walterfan.devaider.repository;

import org.apache.ibatis.annotations.*;

import java.util.List;

import com.github.walterfan.devaider.domain.Prompt;

public interface PromptRepository {
    @Select("SELECT * FROM prompts")
    List<Prompt> findAll();

    @Select("SELECT * FROM prompts WHERE id = #{id}")
    Prompt findById(Long id);

    @Insert("INSERT INTO prompts(name, desc, systemPrompt, userPrompt, additionalPrompt, tags, variables) VALUES(#{name}, #{desc}, #{systemPrompt}, #{userPrompt}, #{additionalPrompt}, #{tags}, #{variables})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void save(Prompt prompt);

    @Update("UPDATE prompts SET name=#{name}, desc=#{desc}, systemPrompt=#{systemPrompt}, userPrompt=#{userPrompt}, additionalPrompt=#{additionalPrompt}, tags=#{tags}, variables=#{variables} WHERE id=#{id}")
    void update(Prompt prompt);

    @Delete("DELETE FROM prompts WHERE id = #{id}")
    void deleteById(Long id);
}
