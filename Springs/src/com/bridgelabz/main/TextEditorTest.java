package com.bridgelabz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelabz.config.TextEditorConfig;
import com.bridgelabz.model.TextEditor;
import com.bridgelabz.springannotations.A;
import com.bridgelabz.springannotations.B;

public class TextEditorTest
{
public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextEditorConfig.class);
	TextEditor textEditor = applicationContext.getBean(TextEditor.class);
	textEditor.spellCheck();
}
}
