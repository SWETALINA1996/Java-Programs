package com.bridgelabz.model;

public class TextEditor
{
SpellChecker spell;
public TextEditor(SpellChecker spell) 
{
	System.out.println("Checked..");
	this.spell = spell;
}
public void spellCheck()
{
	System.out.println("checking done...");
}
}
