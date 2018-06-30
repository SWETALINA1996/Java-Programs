package com.bridgelabz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.model.SpellChecker;
import com.bridgelabz.model.TextEditor;

@Configuration
public class TextEditorConfig
{
@Bean
public TextEditor text() {
	return new TextEditor(spell());
}

@Bean
public SpellChecker spell()
{
	return new SpellChecker();
}

}
