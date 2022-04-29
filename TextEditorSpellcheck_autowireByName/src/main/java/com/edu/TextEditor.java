package com.edu;

public class TextEditor {
	private SpellCheck spellcheck;

	public SpellCheck getSpellcheck() {
		return spellcheck;
	}

	public void setSpellcheck(SpellCheck spellcheck) {
		this.spellcheck = spellcheck;
	}
	
	public void spellCheckFunction() {
		if(spellcheck!=null) {
			spellcheck.pump();
		}
		else
		{
			System.out.println("spellcheck is disabled");
		}
	}

	/*public TextEditor(SpellCheck spellcheck) {
		super();
		this.spellcheck = spellcheck;
	}*/

}
