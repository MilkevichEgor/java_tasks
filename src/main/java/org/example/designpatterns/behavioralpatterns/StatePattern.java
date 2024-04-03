package org.example.designpatterns.behavioralpatterns;

public class StatePattern {

  public static void main(String[] args) {

	TextEditor textEditor = new TextEditor(new UpperCase());
	textEditor.type("Hello World");

	textEditor.setState(new LowerCase());
	textEditor.type("Hello World");

	textEditor.setState(new Default());
	textEditor.type("Hello World");

  }
}

interface WritingState {

  void write(String words);
}

class UpperCase implements WritingState {

  @Override
  public void write(String words) {
	System.out.println(words.toUpperCase());
  }
}

class LowerCase implements WritingState {

  @Override
  public void write(String words) {
	System.out.println(words.toLowerCase());
  }
}

class Default implements WritingState {

  @Override
  public void write(String words) {
	System.out.println(words);
  }
}

class TextEditor {
  private WritingState writingState;

  public TextEditor(WritingState writingState) {
	this.writingState = writingState;
  }

  public void setState(WritingState writingState) {
	this.writingState = writingState;
  }

  public void type (String words) {
	writingState.write(words);
  }
}
